package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpMobashraSearchDto {

    private Long id;                     // EMP_MOBASHRA.ID
    private String employeeName;         // الاســـم
    private String jobName;             // الوظيفة
    private String cardId;               // رقم السجل / الإقامة
    private String fia;                  // المرتبة / الفئة
    private BigDecimal draga;            // الدرجة
    private BigDecimal salary;           // الراتب
    private BigDecimal naqlBadal;        // بدل النقل

}
