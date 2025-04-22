package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpMokhalfatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfat;
import com.horan.elshamel.personnelmanagement.repo.EmpMokhalfatRepo;
import com.horan.elshamel.personnelmanagement.service.EmpMokhalfatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpMokhalfatServiceImpl extends BaseServiceImpl<EmpMokhalfat,Long> implements EmpMokhalfatService {

    private final EmpMokhalfatRepo repo;

    @Override
    public List<EmpMokhalfatSearchDto> searchMokhalfat(String name, String cardId) {
        return repo.searchMokhalfat(name, cardId);
    }
//
//    @Override
//    public List<EmpMokhalfat> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpMokhalfat save( EmpMokhalfat dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpMokhalfat update(EmpMokhalfat dto) {
//        EmpMokhalfat empMokhalfat = findById(dto.getId());
//        empMokhalfat.setName(dto.getName());
//        repo.save(empMokhalfat);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpMokhalfat findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp Mokhalfat with id "+ id + " not found")
//        );
//    }
}
