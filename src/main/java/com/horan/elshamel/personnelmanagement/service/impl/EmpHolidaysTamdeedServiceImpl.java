package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysTamdeed;
import com.horan.elshamel.personnelmanagement.repo.EmpHolidaysTamdeedRepo;
import com.horan.elshamel.personnelmanagement.service.EmpHolidaysTamdeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmpHolidaysTamdeedServiceImpl extends BaseServiceImpl<EmpHolidaysTamdeed, Long> implements EmpHolidaysTamdeedService {

    private final EmpHolidaysTamdeedRepo repo;

    @Override
    public List<EmpHolidaysTamdeed> findAllByHolidaysId(Long holidayId) {
        return repo.findAllByHolidaysId(holidayId);
    }

//    @Override
//    public Long getNextId() {
//        return repo.getNextId();
//    }

//
//    @Override
//    public List<EmpHolidaysTamdeed> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpHolidaysTamdeed save( EmpHolidaysTamdeed dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpHolidaysTamdeed update(EmpHolidaysTamdeed dto) {
//        EmpHolidaysTamdeed empDegrees = findById(dto.getId());
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
//    private EmpHolidaysTamdeed findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
