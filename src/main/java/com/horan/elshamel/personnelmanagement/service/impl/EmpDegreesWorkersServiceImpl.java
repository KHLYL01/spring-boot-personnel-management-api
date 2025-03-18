package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegreesWorkers;
import com.horan.elshamel.personnelmanagement.service.EmpDegreesWorkersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpDegreesWorkersServiceImpl extends BaseServiceImpl<EmpDegreesWorkers,Long> implements EmpDegreesWorkersService {

//    private final EmpDegreesWorkersRepo repo;
//
//    @Override
//    public List<EmpDegreesWorkers> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpDegreesWorkers save( EmpDegreesWorkers dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpDegreesWorkers update(EmpDegreesWorkers dto) {
//        EmpDegreesWorkers empDegreesWorkers = findById(dto.getId());
//        empDegreesWorkers.setFia(dto.getFia());
//        empDegreesWorkers.setDraga(dto.getDraga());
//        empDegreesWorkers.setElawa(dto.getElawa());
//        empDegreesWorkers.setNaqlBadal(dto.getNaqlBadal());
//        empDegreesWorkers.setSalary(dto.getSalary());
//        repo.save(empDegreesWorkers);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpDegreesWorkers findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp Degrees Workers with id "+ id + " not found")
//        );
//    }
}
