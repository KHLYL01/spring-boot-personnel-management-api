package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.entity.EmpJobs;
import com.horan.elshamel.personnelmanagement.model.entity.EmpParts;

import java.util.List;

public interface EmpPartsService extends BaseService<Long, EmpParts> {

    List<EmpParts> findParts(Long id, String name);

//    List<EmpParts> findAll();
//
//    EmpParts save(EmpParts dto);
//
//    EmpParts update(EmpParts dto);
//
//    void delete(long id);
}
