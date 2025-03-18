package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegreesWorkers;
import com.horan.elshamel.personnelmanagement.model.entity.EmpParts;
import com.horan.elshamel.personnelmanagement.repo.EmpPartsRepo;
import com.horan.elshamel.personnelmanagement.service.EmpPartsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpPartsServiceImpl extends BaseServiceImpl<EmpParts,Long> implements EmpPartsService {

//    private final EmpPartsRepo repo;
//
//    @Override
//    public List<EmpParts> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpParts save( EmpParts dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpParts update(EmpParts dto) {
//        EmpParts empParts = findById(dto.getId());
//        empParts.setName(dto.getName());
//        repo.save(empParts);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpParts findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp Part with id "+ id + " not found")
//        );
//    }
}
