package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegrees;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpDegreesService extends BaseService<Long,EmpDegrees>{


    List<EmpDegrees> findDegrees(Double martaba, Double draga);
//    List<EmpDegrees> findAll();
//
//    EmpDegrees save(EmpDegrees dto);
//
//    EmpDegrees update(EmpDegrees dto);
//
//    void delete(long id);
}
