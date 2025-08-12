package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpKashfTepySearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpKashfTepy;

import java.util.List;

public interface EmpKashfTepyService extends BaseService<Long,EmpKashfTepy>{


    List<EmpKashfTepySearchDto> searchKashfTepy(String name, String cardId, String empType);

//    List<EmpKashfTepy> findAll();
//
//    EmpKashfTepy save(EmpKashfTepy dto);
//
//    EmpKashfTepy update(EmpKashfTepy dto);
//
//    void delete(long id);
}
