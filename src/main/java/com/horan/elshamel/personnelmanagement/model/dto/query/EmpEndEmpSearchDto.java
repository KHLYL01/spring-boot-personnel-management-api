package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpEndEmpSearchDto {

    private Long id;                     // EMP_ENDEMP.ID
    private String qrarId;               // رقم القرار
    private String qrarDate;             // تاريخ القرار
    private String employeeName;         // اسم الموظف
    private String terminationDate;      // تاريخ الإنهاء

}
