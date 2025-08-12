package com.horan.elshamel.personnelmanagement.model.dto.det;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpMokhalfatDetDto {

    private Long id;
    private Long empId;
    private String empName;
    private BigDecimal salary;
    private BigDecimal naqlBadal;
    private String fia;
    private BigDecimal draga;
    private BigDecimal gza;

}
