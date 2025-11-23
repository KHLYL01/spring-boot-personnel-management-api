package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.model.dto.request.UserSignatureRequestDto;
import com.horan.elshamel.personnelmanagement.model.dto.response.UserSignatureResponseDto;
import com.horan.elshamel.personnelmanagement.model.entity.User;
import com.horan.elshamel.personnelmanagement.model.entity.UserSignature;
import com.horan.elshamel.personnelmanagement.repo.UserRepo;
import com.horan.elshamel.personnelmanagement.repo.UserSignatureRepo;
import com.horan.elshamel.personnelmanagement.service.UserSignatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSignatureServiceImpl implements UserSignatureService {

    private final UserSignatureRepo repo;
    private final UserRepo userRepo;

    @Override
    public List<UserSignatureResponseDto> findAll() {
        return toDtos(repo.findAll());
    }

    @Override
    public List<UserSignatureResponseDto> findAllByUserId(Long userId) {
        return toDtos(repo.findAllByUserId(userId));
    }

    @Override
    public UserSignatureResponseDto findById(Long id) {
        UserSignature userSignature = repo.findById(id).orElseThrow(() -> new RuntimeException("User Signature not found"));
        return toDto(userSignature);
    }


    @Override
    public UserSignatureResponseDto save(UserSignatureRequestDto dto) throws IOException {
        User user = userRepo.findById(dto.getUserId()).orElseThrow(() -> new RuntimeException("User Not Found"));

        BufferedImage read = ImageIO.read(dto.getImage().getInputStream());

        byte[] image = removeSignatureBackground(read);

//        byte[] image = dto.getImage().getBytes();
        UserSignature userSignature = UserSignature.builder().image(image).user(user).content(dto.getContent()).password(dto.getPassword()).build();

        return toDto(repo.save(userSignature));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public byte[] viewImageById(Long id) {
        UserSignature userSignature = repo.findById(id).orElseThrow(() -> new RuntimeException("User Signature not found"));
        return userSignature.getImage();
    }


    private UserSignatureResponseDto toDto(UserSignature userSignature) {
        if (userSignature == null) {
            return null;
        }
        return UserSignatureResponseDto.builder()
                .id(userSignature.getId())
                .userId(userSignature.getUser().getId())
                .empName(userSignature.getUser().getEmpName())
                .imageUrl("/signatures/" + userSignature.getId() + "/image")
                .image(userSignature.getImage())
                .content(userSignature.getContent())
                .password(userSignature.getPassword())
                .build();
    }

    private List<UserSignatureResponseDto> toDtos(List<UserSignature> userSignatures) {
        if (userSignatures == null) {
            return null;
        }
        List<UserSignatureResponseDto> userSignatureResponseDtos = new ArrayList<>();
        userSignatures.forEach(userSignature -> {
            userSignatureResponseDtos.add(toDto(userSignature));
        });
        return userSignatureResponseDtos;
    }

    private byte[] removeSignatureBackground(BufferedImage originalImage) throws IOException {
        // 1. التأكد من أن الصورة تدعم الشفافية
        BufferedImage processedImage = new BufferedImage(
                originalImage.getWidth(),
                originalImage.getHeight(),
                BufferedImage.TYPE_INT_ARGB // يجب أن يكون ARGB
        );

        for (int y = 0; y < originalImage.getHeight(); y++) {
            for (int x = 0; x < originalImage.getWidth(); x++) {
                int rgb = originalImage.getRGB(x, y);

                // استخراج قيم R, G, B
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;

                // العتبة: إذا كان البكسل قريباً من الأبيض
                if (r > 230 && g > 230 && b > 230) {
                    // وضع بكسل شفاف (Alpha = 0)
                    processedImage.setRGB(x, y, 0x00000000); // 0x00 هو قيمة Alpha
                } else {
                    // وضع البكسل الأصلي في الصورة الجديدة
                    // يمكن أيضاً توحيد التوقيع إلى أسود نقي هنا (0xFF000000)
                    processedImage.setRGB(x, y, rgb);
                }
            }
        }

        // 2. تحويل الصورة المعالجة إلى مصفوفة بايت PNG
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(processedImage, "png", baos);
        return baos.toByteArray();
    }

}
