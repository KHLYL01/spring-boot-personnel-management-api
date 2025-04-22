package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.PassportSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Passport;

import java.util.List;

public interface PassportService extends BaseService<Long,Passport> {

    List<PassportSearchDto> searchPassport(String name, String passportNumber);

}
