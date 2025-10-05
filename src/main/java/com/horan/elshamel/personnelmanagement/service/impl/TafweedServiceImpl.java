package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.query.TafweedSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Tafweed;
import com.horan.elshamel.personnelmanagement.repo.TafweedRepo;
import com.horan.elshamel.personnelmanagement.service.TafweedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TafweedServiceImpl extends BaseServiceImpl<Tafweed, Long> implements TafweedService {

    private final TafweedRepo repo;

    @Override
    public List<TafweedSearchDto> searchTafweed(Long empId) {
        return repo.searchTafweed(empId);
    }

    @Override
    public List<TafweedSearchDto> reportTafweed(Long empId) {
        return repo.reportTafweed(empId);
    }


//
//    @Override
//    public List<Tafweed> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public Tafweed save( Tafweed dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public Tafweed update(Tafweed dto) {
//        Tafweed empDegrees = findById(dto.getId());
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
//    private Tafweed findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
