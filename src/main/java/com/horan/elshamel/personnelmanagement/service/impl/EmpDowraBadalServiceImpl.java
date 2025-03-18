package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegreesWorkers;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowraBadal;
import com.horan.elshamel.personnelmanagement.repo.EmpDowraBadalRepo;
import com.horan.elshamel.personnelmanagement.service.EmpDowraBadalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpDowraBadalServiceImpl extends BaseServiceImpl<EmpDowraBadal,Long> implements EmpDowraBadalService {

//    private final EmpDowraBadalRepo repo;
//
//    @Override
//    public List<EmpDowraBadal> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpDowraBadal save( EmpDowraBadal dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpDowraBadal update(EmpDowraBadal dto) {
//        EmpDowraBadal empDowraBadal = findById(dto.getId());
//
//        empDowraBadal.setMartaba(dto.getMartaba());
//        empDowraBadal.setClassA(dto.getClassA());
//        empDowraBadal.setClassB(dto.getClassB());
//        empDowraBadal.setClassC(dto.getClassC());
//        empDowraBadal.setInternal(dto.getInternal());
//        empDowraBadal.setHighLiving(dto.getHighLiving());
//
//        repo.save(empDowraBadal);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpDowraBadal findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp dowra badal with id "+ id + " not found")
//        );
//    }
}
