package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.model.entity.EmpServices;
import com.horan.elshamel.personnelmanagement.repo.EmpServicesRepo;
import com.horan.elshamel.personnelmanagement.service.EmpServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpServicesServiceImpl implements EmpServicesService {

    private final EmpServicesRepo repo;

    @Override
    public List<EmpServices> findByEmpId(Long empId) {
        return repo.findByEmpId(empId);
    }

    @Override
    public List<EmpServices> findAll() {
        return repo.findAll();
    }

    @Override
    public EmpServices save(EmpServices dto) {
        dto.setId(repo.getNextId());
        return repo.save(dto);
    }

    @Override
    public void deleteById(Long id) {
        repo.delete(findById(id));
    }

    public EmpServices findById(Long id){
        return repo.findById(id).orElseThrow(
                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
        );
    }
}
