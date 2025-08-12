package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpTarqeaSearchDto {

    private Long id;                     // EMP_TARQEA.ID
    private String qrarId;               // رقم قرار الترقية
    private String qrarDate;             // تاريخ القرار
    private String employeeName;         // اسم الموظف
    private String oldFia;               // المرتبة القديمة
    private String newFia;               // المرتبة الجديدة

}
