package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmployeeFindDto;
import com.horan.elshamel.personnelmanagement.model.dto.EmployeeSearchDto;
import com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EmployeeService extends BaseService<Long, Employee> {

    List<EmployeeSearchDto> searchEmployee(Long id, String name, String cardId, Long jobId,
                                           Long partId, String fia, BigDecimal draga,
                                           String jobState, String empType
    );

    List<EmployeeFindDto> findEmployee(Long id, String name, String cardId, String empType);
    byte[] downloadImage(Long id);

    List<MosaeerSalaryDto> getMosaeerSalary(String empType, Date startDate, Date endDate);


}
