package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.model.entity.EmpServices;

import java.util.List;

public interface EmpServicesService {

    List<EmpServices> findByEmpId(Long empId);
    List<EmpServices> findAll();
    EmpServices save(EmpServices empServices);
    EmpServices findById(Long id);
    void deleteById(Long id);
}
