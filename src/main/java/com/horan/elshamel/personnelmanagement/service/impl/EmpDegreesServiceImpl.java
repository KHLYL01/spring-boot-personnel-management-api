package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegrees;
import com.horan.elshamel.personnelmanagement.repo.EmpDegreesRepo;
import com.horan.elshamel.personnelmanagement.service.EmpDegreesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpDegreesServiceImpl extends BaseServiceImpl<EmpDegrees,Long> implements EmpDegreesService {

    private final EmpDegreesRepo repo;

    @Override
    public List<EmpDegrees> findDegrees(Double martaba, Double draga) {
        return repo.findDegrees(martaba,draga);
    }

//
//    @Override
//    public List<EmpDegrees> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpDegrees save( EmpDegrees dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpDegrees update(EmpDegrees dto) {
//        EmpDegrees empDegrees = findById(dto.getId());
//        empDegrees.setMartaba(dto.getMartaba());
//        empDegrees.setDraga(dto.getDraga());
//        empDegrees.setElawa(dto.getElawa());
//        empDegrees.setNaqlBadal(dto.getNaqlBadal());
//        empDegrees.setInEntedabBadal(dto.getInEntedabBadal());
//        empDegrees.setOutEntedabadal(dto.getOutEntedabadal());
//        empDegrees.setSalary(dto.getSalary());
//        empDegrees.setType(dto.getType());
//        repo.save(empDegrees);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpDegrees findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
