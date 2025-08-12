package com.horan.elshamel.personnelmanagement.model.dto.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
public class UserSignatureResponseDto {

    private Long id;
    private Long userId;
    private String empName;
    private String content;
    private String imageUrl;
    private byte[] image;
    private String password;

}
