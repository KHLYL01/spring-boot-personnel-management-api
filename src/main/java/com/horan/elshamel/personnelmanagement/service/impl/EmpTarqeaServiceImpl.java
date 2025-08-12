package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTarqeaSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTarqea;
import com.horan.elshamel.personnelmanagement.repo.EmpTarqeaRepo;
import com.horan.elshamel.personnelmanagement.service.EmpTarqeaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpTarqeaServiceImpl extends BaseServiceImpl<EmpTarqea, Long> implements EmpTarqeaService {

    private final EmpTarqeaRepo repo;

    @Override
    public List<EmpTarqeaSearchDto> searchTarqea(String qrarId, String name) {
        return repo.searchTarqea(qrarId, name);
    }


//
//    @Override
//    public List<EmpTarqea> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpTarqea save( EmpTarqea dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpTarqea update(EmpTarqea dto) {
//        EmpTarqea empDegrees = findById(dto.getId());
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
//    private EmpTarqea findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
