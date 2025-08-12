package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpEntedabSearchDto {

    private Long id;                     // EMP_ENTEDAB.ID
    private String cardId;               // رقم السجل المدني
    private String employeeName;         // الاسم
    private String jobTitle;             // مسمى الوظيفة
    private String entedabPlace;      // جهة الإنتداب
    private Long period;                 // المدة
    private String assignmentStartDate;  // تاريخ بداية الإنتداب

}
