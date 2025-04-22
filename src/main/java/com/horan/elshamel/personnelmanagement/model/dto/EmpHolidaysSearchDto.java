package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
public class EmpHolidaysSearchDto {

    private Long id;                     // EMP_HOLIDAYS.ID
    private Date startDate;              // EMP_HOLIDAYS.DATBEGINGO
    private String cardId;               // رقم السجل المدني
    private String employeeName;         // الاسم
    private String jobName;             // مسمى الوظيفة
    private Integer holidayType;          // نوع الإجازة
    private String holidayStartDate;     // تاريخ بداية الإجازة
    private String holidayEndDate;       // تاريخ انتهاء الاجازة
    private BigDecimal period;           // مدة الإجازة
    private String employmentType;       // نوع الوظيفة
    private Integer etemad;               // الاعتماد (نعم/لا)

}
