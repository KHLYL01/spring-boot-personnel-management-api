package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegreesWorkers;
import com.horan.elshamel.personnelmanagement.model.entity.EmpNations;
import com.horan.elshamel.personnelmanagement.repo.EmpNationsRepo;
import com.horan.elshamel.personnelmanagement.service.EmpNationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpNationsServiceImpl extends BaseServiceImpl<EmpNations,Long> implements EmpNationsService {

//    private final EmpNationsRepo repo;
//
//    @Override
//    public List<EmpNations> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpNations save( EmpNations dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpNations update(EmpNations dto) {
//        EmpNations empNation = findById(dto.getId());
//        empNation.setName(dto.getName());
//        repo.save(empNation);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpNations findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp Nation with id "+ id + " not found")
//        );
//    }
}
