package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpJobs;
import com.horan.elshamel.personnelmanagement.repo.EmpJobsRepo;
import com.horan.elshamel.personnelmanagement.service.EmpJobsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpJobsServiceImpl extends BaseServiceImpl<EmpJobs,Long> implements EmpJobsService {

    private final EmpJobsRepo repo;

    @Override
    public List<EmpJobs> findJobs(Long id, String name) {
        return repo.findJobs(id,name);
    }


//    private final EmpJobsRepo repo;
//
//    @Override
//    public List<EmpJobs> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpJobs save( EmpJobs dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpJobs update(EmpJobs dto) {
//        EmpJobs empJobs = findById(dto.getId());
//        empJobs.setName(dto.getName());
//        repo.save(empJobs);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpJobs findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
