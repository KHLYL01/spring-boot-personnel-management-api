package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.model.dto.response.BladiaInfoWithEmpPartInfoResponseDto;

public interface BladiaInfoWithEmpPartInfoService {

    BladiaInfoWithEmpPartInfoResponseDto findAll();

    void save(BladiaInfoWithEmpPartInfoResponseDto dto);

}
