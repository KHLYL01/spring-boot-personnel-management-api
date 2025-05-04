package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysTamdeed;

import java.util.List;

public interface EmpHolidaysTamdeedService extends BaseService<Long,EmpHolidaysTamdeed> {


    List<EmpHolidaysTamdeed> findAllByHolidaysId(Long holidayId);
//
//    Long getNextId();
}
