package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidays;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface EmpHolidaysService extends BaseService<Long, EmpHolidays> {

    List<EmpHolidaysSearchDto> searchHolidays(Long empId, String name, String cardId, String empType, Integer holidayType);

    List<EmpHolidaysReportDto> reportHolidays(boolean all, Long empId, Date fromDate, Date toDate, BigDecimal fromPeriod, BigDecimal toPeriod, Integer holidayType);

//    EmpHolidaysType have(Long empId, Date datWork);

    BigDecimal countHoliday( Long empId,
                         List<Integer> holidaysType,
                         Date fromDate,
                         Date toDate);

    BigDecimal countHolidayTamdeed(Long empId, List<Integer> holidaysType, Date fromDate, Date toDate);

    BigDecimal countHolidayMotfareqa(Long empId, List<Integer> holidaysType, Date fromDate, Date toDate);


    BigDecimal countHolidayMorahal( Long empId,
                             List<Integer> holidaysType,
                             String year);

//    List<EmpHolidays> findAll();
//
//    EmpHolidays save(EmpHolidays dto);
//
//    EmpHolidays update(EmpHolidays dto);
//
//    void delete(long id);
}
