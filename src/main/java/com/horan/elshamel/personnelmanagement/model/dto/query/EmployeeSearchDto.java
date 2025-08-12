package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmployeeSearchDto {

    private Long id;
    private String name;
    private String cardId;
    private Long jobId;
    private String jobName;
    private Long partId;
    private String partName;
    private String fia;
    private BigDecimal salary;
    private BigDecimal draga;
    private String jobState;
    private String workJob;

}
