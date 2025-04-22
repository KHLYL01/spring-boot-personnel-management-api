package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpDowraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowra;
import com.horan.elshamel.personnelmanagement.repo.EmpDowraRepo;
import com.horan.elshamel.personnelmanagement.service.EmpDowraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpDowraServiceImpl extends BaseServiceImpl<EmpDowra, Long> implements EmpDowraService {

    private final EmpDowraRepo repo;

    @Override
    public List<EmpDowraSearchDto> searchDowra(String name, String cardId) {
        return repo.searchDowra(name, cardId);
    }


//
//    @Override
//    public List<EmpDowra> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpDowra save( EmpDowra dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpDowra update(EmpDowra dto) {
//        EmpDowra empDegrees = findById(dto.getId());
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
//    private EmpDowra findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
