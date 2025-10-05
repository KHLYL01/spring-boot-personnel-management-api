package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpMokhalfatReportDto {

    private Long id;
    private String employeeName;
    private String cardId;
    private String jobName;
    private String fia;
    private String periodFrom;
    private String periodTo;
    private String mokhalfaType;
    private BigDecimal gza;

}
