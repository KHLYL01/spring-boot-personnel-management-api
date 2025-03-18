package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.model.dto.BladiaInfoWithEmpPartInfoDto;

public interface BladiaInfoWithEmpPartInfoService {

    BladiaInfoWithEmpPartInfoDto findAll();

    void save(BladiaInfoWithEmpPartInfoDto dto);

}
