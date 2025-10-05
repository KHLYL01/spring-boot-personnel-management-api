package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpHasmiatReportDto {

    private Long id;
    private String employeeName;
    private String jobName;
    private String fia;
    private String qrarId;
    private String datQrar;
    private BigDecimal ghyab;
    private BigDecimal tagmee3;
    private BigDecimal gza;

}
