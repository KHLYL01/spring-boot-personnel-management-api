package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpHasmiatDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatSearchDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatReportDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmDet;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmiat;

import java.util.Date;
import java.util.List;

public interface EmpHasmiatService extends BaseService<Long, EmpHasmiat> {


    List<EmpHasmiatSearchDto> searchHasmiat(String name, String cardId);

    List<EmpHasmiatReportDto> reportHasmiat(boolean all, Long empId, Date fromDate, Date toDate);

    List<EmpHasmiatDetDto> getHasmiatDetByHasmiatId(Long hasmiatId);

    EmpHasmDet saveHasmiatDet(EmpHasmDet empHasmDet);

    void deleteHasmDetById(Long id);

    Long getNextDetId();


}
