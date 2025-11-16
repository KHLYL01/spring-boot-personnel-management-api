package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysCut;

import java.util.List;

public interface EmpHolidaysCutService extends BaseService<Long,EmpHolidaysCut> {


    List<EmpHolidaysCut> findAllByHolidaysId(Long holidayId);

}
