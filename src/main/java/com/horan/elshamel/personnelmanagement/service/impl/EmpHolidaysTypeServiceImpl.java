package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysType;
import com.horan.elshamel.personnelmanagement.service.EmpHolidaysTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpHolidaysTypeServiceImpl extends BaseServiceImpl<EmpHolidaysType,Long> implements EmpHolidaysTypeService {

//    private final EmpHolidaysTypeRepo repo;
//
//    @Override
//    public List<EmpHolidaysType> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpHolidaysType save( EmpHolidaysType dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpHolidaysType update(EmpHolidaysType dto) {
//        EmpHolidaysType empNation = findById(dto.getId());
//        empNation.setName(dto.getName());
//        repo.save(empNation);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpHolidaysType findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp Nation with id "+ id + " not found")
//        );
//    }
}
