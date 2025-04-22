package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmployeeFindDto;
import com.horan.elshamel.personnelmanagement.model.dto.EmployeeSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegreesWorkers;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;
import com.horan.elshamel.personnelmanagement.repo.EmployeeRepo;
import com.horan.elshamel.personnelmanagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.zip.Inflater;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl extends BaseServiceImpl<Employee, Long> implements EmployeeService {

    private final EmployeeRepo repo;

    @Override
    public List<Employee> findAll() {
        return repo.findAll(PageRequest.of(0, 10, Sort.by("Id"))).getContent();
//        return repo.findAll();
    }

    public byte[] downloadImage(Long id) {
        Employee employee = findById(id);
        return employee.getPicEmp();
    }

    @Override
    public List<EmployeeSearchDto> searchEmployee(Long id, String name, String cardId, Long jobId,
                                                  Long partId, String fia, BigDecimal draga,
                                                  String jobState, String empType) {
        return repo.searchEmployee(id, name, cardId, jobId, partId, fia, draga, jobState, empType);
    }

    @Override
    public List<EmployeeFindDto> findEmployee(Long id, String name, String cardId, String empType) {
        return repo.findEmployee(id, name, cardId, empType);
    }

//    public  byte[] decompressImage(byte[] data) {
//        Inflater inflater = new Inflater();
//        inflater.setInput(data);
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//        byte[] tmp = new byte[4*1024];
//        try {
//            while (!inflater.finished()) {
//                int count = inflater.inflate(tmp);
//                outputStream.write(tmp, 0, count);
//            }
//            outputStream.close();
//        } catch (Exception ignored) {
//        }
//        return outputStream.toByteArray();
//    }

}
