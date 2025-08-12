package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.model.dto.response.UserPassResponseDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpUsersPass;
import com.horan.elshamel.personnelmanagement.repo.EmpUsersPassRepo;
import com.horan.elshamel.personnelmanagement.service.EmpUsersPassService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpUsersPassServiceImpl implements EmpUsersPassService {

    private final EmpUsersPassRepo repo;

    @Override
    public BigDecimal getNextDetId() {
        return repo.getNextId();
    }

    @Override
    public List<UserPassResponseDto> findAllUsers() {
        return repo.findAllUsers();
    }

    @Override
    public List<EmpUsersPass> findAllById(BigDecimal id) {
        return repo.findAllByKeyId(id);
    }

    @Override
    public List<EmpUsersPass> saveAllForId(List<EmpUsersPass> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        deleteAllById(list.get(0).getKey().getId());

        return repo.saveAll(list);
    }

    @Override
    public void deleteAllById(BigDecimal id) {
        repo.deleteAllById(id);
    }


//
//    @Override
//    public List<EmpUsersPass> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpUsersPass save( EmpUsersPass dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpUsersPass update(EmpUsersPass dto) {
//        EmpUsersPass empDegrees = findById(dto.getId());
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
//    private EmpUsersPass findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
