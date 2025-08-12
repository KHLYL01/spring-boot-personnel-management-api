package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpTaeenSearchDto {
    private Long id;                     // EMP_TAEEN.ID
    private String qrarId;               // رقم القرار
    private String qrarDate;             // تاريخ القرار
    private String employeeName;         // اسم الموظف
    private String socialInsuranceNo;    // رقم التأمين الاجتماعي
    private String directDate;           // يوم المباشرة
}
