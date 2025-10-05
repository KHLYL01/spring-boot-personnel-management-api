package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidays;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface EmpHolidaysService extends BaseService<Long, EmpHolidays> {

    List<EmpHolidaysSearchDto> searchHolidays(Long empId, String name, String cardId, String empType, Integer holidayType);

    List<EmpHolidaysReportDto> reportHolidays(boolean all, Long empId, Date fromDate, Date toDate, BigDecimal fromPeriod, BigDecimal toPeriod, Integer holidayType);

//    List<EmpHolidays> findAll();
//
//    EmpHolidays save(EmpHolidays dto);
//
//    EmpHolidays update(EmpHolidays dto);
//
//    void delete(long id);
}
