package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegreesWorkers;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowraBadalCountry;
import com.horan.elshamel.personnelmanagement.repo.EmpDowraBadalCountryRepo;
import com.horan.elshamel.personnelmanagement.service.EmpDowraBadalCountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpDowraBadalCountryServiceImpl extends BaseServiceImpl<EmpDowraBadalCountry,Long> implements EmpDowraBadalCountryService {

//    private final EmpDowraBadalCountryRepo repo;
//
//    @Override
//    public List<EmpDowraBadalCountry> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpDowraBadalCountry save( EmpDowraBadalCountry dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpDowraBadalCountry update(EmpDowraBadalCountry dto) {
//        EmpDowraBadalCountry empDowraBadalCountry = findById(dto.getId());
//        empDowraBadalCountry.setName(dto.getName());
//        empDowraBadalCountry.setCountryClass(dto.getCountryClass());
//        repo.save(empDowraBadalCountry);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpDowraBadalCountry findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp Dowra Badal Country with id "+ id + " not found")
//        );
//    }
}
