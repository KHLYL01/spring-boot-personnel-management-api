package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.query.PassportSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Passport;
import com.horan.elshamel.personnelmanagement.repo.PassportRepo;
import com.horan.elshamel.personnelmanagement.service.PassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PassportServiceImpl extends BaseServiceImpl<Passport, Long> implements PassportService {

    private final PassportRepo repo;

    @Override
    public List<PassportSearchDto> searchPassport(String name, String passportNumber) {
        return repo.searchPassport(name, passportNumber);
    }


//
//    @Override
//    public List<Passport> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public Passport save( Passport dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public Passport update(Passport dto) {
//        Passport empDegrees = findById(dto.getId());
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
//    private Passport findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
