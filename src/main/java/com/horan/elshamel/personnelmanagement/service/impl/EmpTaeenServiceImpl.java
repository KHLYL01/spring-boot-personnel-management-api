package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTaeenSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTaeen;
import com.horan.elshamel.personnelmanagement.repo.EmpTaeenRepo;
import com.horan.elshamel.personnelmanagement.service.EmpTaeenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpTaeenServiceImpl extends BaseServiceImpl<EmpTaeen, Long> implements EmpTaeenService {

    private final EmpTaeenRepo repo;

    @Override
    public List<EmpTaeenSearchDto> searchTaeen(String name) {
        return repo.searchTaeen(name);
    }


//
//    @Override
//    public List<EmpTaeen> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpTaeen save( EmpTaeen dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpTaeen update(EmpTaeen dto) {
//        EmpTaeen empDegrees = findById(dto.getId());
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
//    private EmpTaeen findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
