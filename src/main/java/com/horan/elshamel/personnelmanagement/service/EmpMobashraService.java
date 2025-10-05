package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpMobashraReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpMobashraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMobashra;

import java.util.Date;
import java.util.List;

public interface EmpMobashraService extends BaseService<Long,EmpMobashra> {

    List<EmpMobashraSearchDto> searchMobashra(String name, String cardId, String empType);

    List<EmpMobashraReportDto> reportMobashra(boolean all, Long empId, Date fromDate, Date toDate);

}
