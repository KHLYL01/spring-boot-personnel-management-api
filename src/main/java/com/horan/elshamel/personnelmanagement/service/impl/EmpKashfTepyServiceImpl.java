package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpKashfTepySearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpKashfTepy;
import com.horan.elshamel.personnelmanagement.repo.EmpKashfTepyRepo;
import com.horan.elshamel.personnelmanagement.service.EmpKashfTepyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpKashfTepyServiceImpl extends BaseServiceImpl<EmpKashfTepy, Long> implements EmpKashfTepyService {

    private final EmpKashfTepyRepo repo;

    @Override
    public List<EmpKashfTepySearchDto> searchKashfTepy(String name, String cardId, String empType) {
        return repo.searchKashfTepy(name, cardId, empType);
    }

//
//    @Override
//    public List<EmpKashfTepy> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpKashfTepy save( EmpKashfTepy dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpKashfTepy update(EmpKashfTepy dto) {
//        EmpKashfTepy empDegrees = findById(dto.getId());
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
//    private EmpKashfTepy findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
