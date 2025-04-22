package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.entity.EmpNations;

import java.util.List;

public interface EmpNationsService extends BaseService<Long,EmpNations> {

    List<EmpNations> findNations(Long id, String name);

//    List<EmpNations> findAll();
//
//    EmpNations save(EmpNations dto);
//
//    EmpNations update(EmpNations dto);
//
//    void delete(long id);
}
