package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpEqrarSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEqrar;

import java.util.List;

public interface EmpEqrarService extends BaseService<Long,EmpEqrar> {


    List<EmpEqrarSearchDto> searchEqrar(String name);

}
