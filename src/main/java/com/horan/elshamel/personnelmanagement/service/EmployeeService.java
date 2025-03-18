package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;

import java.util.List;

public interface EmployeeService extends BaseService<Long,Employee> {

    byte[] downloadImage(Long id);

}
