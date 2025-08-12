package com.horan.elshamel.personnelmanagement.service;


import com.horan.elshamel.personnelmanagement.model.dto.request.UserSignatureRequestDto;
import com.horan.elshamel.personnelmanagement.model.dto.response.UserSignatureResponseDto;

import java.io.IOException;
import java.util.List;

public interface UserSignatureService {

    List<UserSignatureResponseDto> findAll();

    List<UserSignatureResponseDto> findAllByUserId(Long userId);

    UserSignatureResponseDto findById(Long id);

    UserSignatureResponseDto save(UserSignatureRequestDto dto) throws IOException;

    void deleteById(Long id);

    byte[] viewImageById(Long id);

}
