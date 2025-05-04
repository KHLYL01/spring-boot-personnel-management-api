package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpTakleefDetDto {

    private Long maxId;
    private String empName;
    private BigDecimal salary;
    private BigDecimal naqlBadal;
    private BigDecimal period;
    private String datBegin;
    private String datEnd;
    private String empWork;

}
