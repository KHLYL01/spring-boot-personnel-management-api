package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpMokhalfatSearchDto {

    private Long id;                     // EMP_MOKHALFAT.ID
    private String cardId;               // رقم السجل المدني
    private String employeeName;         // الاسم
    private String jobName;             // مسمى الوظيفة
    private String periodFrom;           // الفترة من
    private String periodTo;             // إلى
    private String mokhalfaType;            // النوع

}
