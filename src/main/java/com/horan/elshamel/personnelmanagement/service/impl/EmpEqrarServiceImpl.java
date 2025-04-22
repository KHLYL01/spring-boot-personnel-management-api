package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpEqrarSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEqrar;
import com.horan.elshamel.personnelmanagement.repo.EmpEqrarRepo;
import com.horan.elshamel.personnelmanagement.service.EmpEqrarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpEqrarServiceImpl extends BaseServiceImpl<EmpEqrar, Long> implements EmpEqrarService {

    private final EmpEqrarRepo repo;

    @Override
    public List<EmpEqrarSearchDto> searchEqrar(String name) {
        return repo.searchEqrar(name);
    }


//
//    @Override
//    public List<EmpEqrar> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpEqrar save( EmpEqrar dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpEqrar update(EmpEqrar dto) {
//        EmpEqrar empDegrees = findById(dto.getId());
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
//    private EmpEqrar findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
