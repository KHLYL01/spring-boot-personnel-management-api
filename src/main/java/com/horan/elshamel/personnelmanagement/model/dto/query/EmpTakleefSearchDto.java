package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpTakleefSearchDto {

    private Long id;                     // EMP_OVERTIME.ID
    private String cardId;               // رقم السجل المدني
    private String employeeName;         // الاسم
    private String jobName;              // مسمى الوظيفة
    private BigDecimal hoursAvg;         // معدل عدد ساعات
    private Long period;                 // عدد أيام الخارج الدوام
    private String dateBegin;            // تاريخ بداية الخارج الدوام
    private String place;                // مكان العمل (added for filtering)

}
