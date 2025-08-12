package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidays;
import com.horan.elshamel.personnelmanagement.repo.EmpHolidaysRepo;
import com.horan.elshamel.personnelmanagement.service.EmpHolidaysService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmpHolidaysServiceImpl extends BaseServiceImpl<EmpHolidays, Long> implements EmpHolidaysService {

    private final EmpHolidaysRepo repo;

    @Override
    public List<EmpHolidaysSearchDto> searchHolidays(Long empId, String name, String cardId, String empType, Integer holidayType) {
        return repo.searchHolidays(empId, name, cardId, empType, holidayType);
    }


//
//    @Override
//    public List<EmpHolidays> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpHolidays save( EmpHolidays dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpHolidays update(EmpHolidays dto) {
//        EmpHolidays empDegrees = findById(dto.getId());
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
//    private EmpHolidays findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
