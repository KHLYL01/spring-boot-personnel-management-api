package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegreesWorkers;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDissent;
import com.horan.elshamel.personnelmanagement.repo.EmpDissentRepo;
import com.horan.elshamel.personnelmanagement.service.EmpDissentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpDissentServiceImpl extends BaseServiceImpl<EmpDissent,Long> implements EmpDissentService {

//    -private final EmpDissentRepo repo;
//
//    @Override
//    public List<EmpDissent> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpDissent save( EmpDissent dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpDissent update(EmpDissent dto) {
//        EmpDissent empDissent = findById(dto.getId());
//        empDissent.setName(dto.getName());
//        repo.save(empDissent);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpDissent findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp Dissent with id "+ id + " not found")
//        );
//    }
}
