package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpDowraSearchDto {
    private Long dowraId;             // DOWRAID
    private String employeeName;      // اسم الموظف
    private String fia;               // المرتبة
    private BigDecimal draga;         // الدرجة
    private BigDecimal salary;        // الراتب
    private BigDecimal naqlBadal;     // بدل النقل
    private String jobName;          // الوظيفة
}
