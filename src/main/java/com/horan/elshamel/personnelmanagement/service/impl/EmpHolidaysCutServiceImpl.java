package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysCut;
import com.horan.elshamel.personnelmanagement.repo.EmpHolidaysCutRepo;
import com.horan.elshamel.personnelmanagement.service.EmpHolidaysCutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmpHolidaysCutServiceImpl extends BaseServiceImpl<EmpHolidaysCut, Long> implements EmpHolidaysCutService {

    private final EmpHolidaysCutRepo repo;

    @Override
    public List<EmpHolidaysCut> findAllByHolidaysId(Long holidayId) {
        return repo.findAllByHolidaysId(holidayId);
    }

//
//    @Override
//    public List<EmpHolidaysCut> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpHolidaysCut save( EmpHolidaysCut dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpHolidaysCut update(EmpHolidaysCut dto) {
//        EmpHolidaysCut empDegrees = findById(dto.getId());
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
//    private EmpHolidaysCut findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
