package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpHasmiatSearchDto {

    private Long id;                     // Emp_Hasmiat.ID
    private String cardId;               // رقم السجل المدني
    private String employeeName;         // الاسم
    private String jobName;             // مسمى الوظيفة
    private String qrarId;               // رقم القرار
    private String datQrar;              // تاريخ القرار

}
