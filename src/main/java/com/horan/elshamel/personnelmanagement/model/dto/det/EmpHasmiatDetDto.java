package com.horan.elshamel.personnelmanagement.model.dto.det;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpHasmiatDetDto {

    private Long id;
    private Long empId;
    private String employeeName;
    private BigDecimal salary;
    private BigDecimal naqlBadal;
    private BigDecimal ghyab;
    private BigDecimal tagmee3;
    private String min;
    private BigDecimal gza;
    private String notes;

}
