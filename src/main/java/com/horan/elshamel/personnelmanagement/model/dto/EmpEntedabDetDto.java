package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
public class EmpEntedabDetDto {

    private Long maxId;
    private Long entedabId;
    private Long empId;

    private String empName;
    private BigDecimal salary;
    private String fia;
    private BigDecimal draga;
    private BigDecimal naqlBadal;
    private BigDecimal entedabBadal;

    private Long prev;
    private BigDecimal externalEntedab;

}
