package com.horan.elshamel.personnelmanagement.model.dto.request;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
public class UserSignatureRequestDto {

    private String content;

    private MultipartFile image;

    private String password;

    private Long userId;

}
