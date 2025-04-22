package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpEntedabSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedab;
import com.horan.elshamel.personnelmanagement.repo.EmpEntedabRepo;
import com.horan.elshamel.personnelmanagement.service.EmpEntedabService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpEntedabServiceImpl extends BaseServiceImpl<EmpEntedab,Long> implements EmpEntedabService {

    private final EmpEntedabRepo repo;

    @Override
    public List<EmpEntedabSearchDto> entedabSearch(String employeeName, String cardId, String entedabPlace) {
        return repo.entedabSearch(employeeName,cardId,entedabPlace);
    }
    //    private final EmpEntedabRepo repo;
//
//    @Override
//    public List<EmpEntedab> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpEntedab save( EmpEntedab dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpEntedab update(EmpEntedab dto) {
//        EmpEntedab empDegrees = findById(dto.getId());
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
//    private EmpEntedab findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
