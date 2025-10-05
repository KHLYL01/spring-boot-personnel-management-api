package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmployeeReportDto {

    private Long id;
    private String name;
    private String partName;
    private String fia;
    private Long jobNo;
    private BigDecimal draga;
    private String jobName;
    private String jobState;
    private String cardId;
    private String bok; // رقم الحفيظة
    private String datBok; //تاريخ الحفيظة
    private String datWork;
    private String datJob;
    private String education;
    private BigDecimal salary;

}
