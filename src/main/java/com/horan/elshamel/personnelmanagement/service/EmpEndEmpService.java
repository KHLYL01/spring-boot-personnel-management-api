package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpEndEmpSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEndEmp;

import java.util.List;

public interface EmpEndEmpService extends BaseService<Long,EmpEndEmp> {

    List<EmpEndEmpSearchDto> searchEndEmp(String name);

}
