package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpKashfTepySearchDto {

    private Long id;                     // EMP_KASHFTEPY.ID
    private String cardId;               // رقم السجل المدني
    private String employeeName;         // الاسم
    private String jobName;             // مسمى الوظيفة
    private String requestDate;          // تاريخ الطلب
    private String employeeStatus;       // حالة الموظف
    private String medicalUnitName;      // اسم الوحدة الصحية

}
