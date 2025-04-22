package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpEntedabSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedab;

import java.util.List;

public interface EmpEntedabService extends BaseService<Long,EmpEntedab> {


    List<EmpEntedabSearchDto> entedabSearch(String employeeName, String cardId, String entedabPlace);
//    List<EmpEntedab> findAll();
//
//    EmpEntedab save(EmpEntedab dto);
//
//    EmpEntedab update(EmpEntedab dto);
//
//    void delete(long id);
}
