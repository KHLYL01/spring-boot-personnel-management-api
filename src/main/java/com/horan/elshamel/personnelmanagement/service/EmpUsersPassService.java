package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.model.dto.response.UserPassResponseDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpUsersPass;

import java.math.BigDecimal;
import java.util.List;

public interface EmpUsersPassService{

    BigDecimal getNextDetId();

    List<UserPassResponseDto> findAllUsers();

    List<EmpUsersPass> findAllById(BigDecimal id);

    List<EmpUsersPass> saveAllForId(List<EmpUsersPass> list);

    void deleteAllById(BigDecimal id);

//
//    EmpUsersPass save(EmpUsersPass dto);
//
//    EmpUsersPass update(EmpUsersPass dto);
//
//    void delete(long id);
}
