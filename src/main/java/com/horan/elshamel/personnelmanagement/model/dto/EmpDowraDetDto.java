package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpDowraDetDto {

    private Long id;
    private Long empId;
    private String empName;
    private BigDecimal salary;
    private BigDecimal draga;
    private String fia;
    private BigDecimal naqlBadal;
    private Long mokafaa;
    private Long badalEntidab;
    private Long badalTransfare;
    private Long ticketCost;

}
