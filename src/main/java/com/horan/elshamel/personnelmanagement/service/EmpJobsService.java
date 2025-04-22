package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.entity.EmpJobs;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;

import java.util.List;

public interface EmpJobsService extends BaseService<Long,EmpJobs> {

    List<EmpJobs> findJobs(Long id,String name);

//    List<EmpJobs> findAll();
//
//    EmpJobs save(EmpJobs dto);
//
//    EmpJobs update(EmpJobs dto);
//
//    void delete(long id);
}
