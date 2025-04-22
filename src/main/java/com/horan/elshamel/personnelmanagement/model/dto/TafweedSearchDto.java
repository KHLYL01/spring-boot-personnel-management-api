package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TafweedSearchDto {

    private Long id;                  // رقم التفويض
    private String employeeName;      // الاسم
    private String startDate;         // تاريخ البداية
    private String endDate;           // تاريخ النهاية
    private String subject;           // الموضوع

}
