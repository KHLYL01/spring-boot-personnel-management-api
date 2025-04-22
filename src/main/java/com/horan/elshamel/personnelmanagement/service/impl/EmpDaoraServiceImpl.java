package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpDaoraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDaora;
import com.horan.elshamel.personnelmanagement.repo.EmpDaoraRepo;
import com.horan.elshamel.personnelmanagement.service.EmpDaoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpDaoraServiceImpl extends BaseServiceImpl<EmpDaora, Long> implements EmpDaoraService {

    private final EmpDaoraRepo repo;


//
//    @Override
//    public List<EmpDaora> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpDaora save( EmpDaora dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpDaora update(EmpDaora dto) {
//        EmpDaora empDegrees = findById(dto.getId());
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
//    private EmpDaora findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
