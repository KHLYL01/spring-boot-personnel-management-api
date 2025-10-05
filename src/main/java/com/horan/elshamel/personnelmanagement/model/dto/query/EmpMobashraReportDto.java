package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpMobashraReportDto {

    private Long id;
    private String employeeName;
    private String jobName;
    private String cardId;
    private String fia;
    private BigDecimal draga;
    private BigDecimal salary;
    private BigDecimal naqlBadal;
    private String datMobashra;
}
