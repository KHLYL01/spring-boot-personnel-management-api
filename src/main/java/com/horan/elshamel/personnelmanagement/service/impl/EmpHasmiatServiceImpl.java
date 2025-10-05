package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpHasmiatDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmDet;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmiat;
import com.horan.elshamel.personnelmanagement.repo.EmpHasmDetRepo;
import com.horan.elshamel.personnelmanagement.repo.EmpHasmiatRepo;
import com.horan.elshamel.personnelmanagement.service.EmpHasmiatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpHasmiatServiceImpl extends BaseServiceImpl<EmpHasmiat,Long> implements EmpHasmiatService {

    private final EmpHasmiatRepo repo;
    private final EmpHasmDetRepo repoDet;

    @Override
    public List<EmpHasmiatSearchDto> searchHasmiat(String name, String cardId) {
        return repo.searchHasmiat(name, cardId);
    }

    @Override
    public List<EmpHasmiatReportDto> reportHasmiat(boolean all, Long empId, Date fromDate, Date toDate) {
        return repo.reportHasmiat(all, empId, fromDate, toDate);
    }

    @Override
    public EmpHasmDet saveHasmiatDet(EmpHasmDet empHasmDet) {
        return repoDet.save(empHasmDet);
    }

    @Override
    public List<EmpHasmiatDetDto> getHasmiatDetByHasmiatId(Long hasmiatId) {
        return repoDet.getHasmiatDetByHasmiatId(hasmiatId);
    }

    @Override
    public void deleteHasmDetById(Long id) {
        repoDet.deleteById(id);
    }

    @Override
    public Long getNextDetId() {
        return repoDet.getNextId();
    }


    //    private final EmpHasmiatRepo repo;
//
//    @Override
//    public List<EmpHasmiat> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpHasmiat save( EmpHasmiat dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpHasmiat update(EmpHasmiat dto) {
//        EmpHasmiat empDegrees = findById(dto.getId());
//        empDegrees.setMartaba(dto.getMartaba());
//        empDegrees.setDraga(dto.getDraga());
//        empDegrees.setElawa(dto.getElawa());
//        empDegrees.setNaqlBadal(dto.getNaqlBadal());
//        empDegrees.setInHasmiatBadal(dto.getInHasmiatBadal());
//        empDegrees.setOutHasmiatadal(dto.getOutHasmiatadal());
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
//    private EmpHasmiat findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
