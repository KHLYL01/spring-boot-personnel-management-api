package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpKashfTepyReportDto {

    private Long id;
    private String employeeName;
    private String jobName;
    private String requestDate;
    private String medicalUnitType;
    private String medicalUnitName;
    private String employeeStatus;
    private String datEnketa3;

}
