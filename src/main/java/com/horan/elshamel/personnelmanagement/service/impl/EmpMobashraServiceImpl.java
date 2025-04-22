package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpMobashraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMobashra;
import com.horan.elshamel.personnelmanagement.repo.EmpMobashraRepo;
import com.horan.elshamel.personnelmanagement.service.EmpMobashraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpMobashraServiceImpl extends BaseServiceImpl<EmpMobashra, Long> implements EmpMobashraService {

    private final EmpMobashraRepo repo;

    @Override
    public List<EmpMobashraSearchDto> searchMobashra(String name, String cardId, String empType) {
        return repo.searchMobashra(name, cardId, empType);
    }


//
//    @Override
//    public List<EmpMobashra> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpMobashra save( EmpMobashra dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpMobashra update(EmpMobashra dto) {
//        EmpMobashra empDegrees = findById(dto.getId());
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
//    private EmpMobashra findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
