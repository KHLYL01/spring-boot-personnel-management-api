package com.horan.elshamel.personnelmanagement.model.mapper;

import com.horan.elshamel.personnelmanagement.base.BaseMapper;
import com.horan.elshamel.personnelmanagement.model.entity.EmpAbsent;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;
import org.mapstruct.Mapper;

@Mapper
public interface EmpAbsentMapper extends BaseMapper<EmpAbsent,Long> {
}
