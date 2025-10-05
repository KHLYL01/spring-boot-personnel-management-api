package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEndEmpSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEndEmp;
import com.horan.elshamel.personnelmanagement.repo.EmpEndEmpRepo;
import com.horan.elshamel.personnelmanagement.service.EmpEndEmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpEndEmpServiceImpl extends BaseServiceImpl<EmpEndEmp, Long> implements EmpEndEmpService {

    private final EmpEndEmpRepo repo;

    @Override
    public List<EmpEndEmpSearchDto> searchEndEmp(String name) {
        return repo.searchEndEmp(name);
    }

    @Override
    public List<EmpEndEmpSearchDto> reportEndEmp(String name) {
        return repo.reportEndEmp(name);
    }


//
//    @Override
//    public List<EmpEndEmp> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpEndEmp save( EmpEndEmp dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpEndEmp update(EmpEndEmp dto) {
//        EmpEndEmp empDegrees = findById(dto.getId());
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
//    private EmpEndEmp findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
