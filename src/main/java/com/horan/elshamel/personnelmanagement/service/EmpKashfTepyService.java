package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpKashfTepyReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpKashfTepySearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpKashfTepy;

import java.util.Date;
import java.util.List;

public interface EmpKashfTepyService extends BaseService<Long,EmpKashfTepy>{


    List<EmpKashfTepySearchDto> searchKashfTepy(String name, String cardId, String empType);
    List<EmpKashfTepyReportDto> reportKashfTepy(boolean all, Long empId, Date fromDate, Date toDate);
//    List<EmpKashfTepy> findAll();
//
//    EmpKashfTepy save(EmpKashfTepy dto);
//
//    EmpKashfTepy update(EmpKashfTepy dto);
//
//    void delete(long id);
}
