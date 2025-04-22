package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassportSearchDto {
    private Long id;                 // رقم الإقرار
    private String declarationDate;  // تاريخ الإقرار
    private String name;             // الاسم
    private String nationality;      // الجنسية
    private String passportNumber;   // رقم الجواز
    private String issuedBy;         // صادر من
}
