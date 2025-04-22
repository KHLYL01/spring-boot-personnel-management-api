package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
public class EmpEqrarSearchDto {
    private Long id; //رقم الإقرار
    private String eqrarName; //اسم المقر
    private String eqrarDate; //تاريخ الإقرار
    private String eqrarPlace; //مكان الحضور
    private Long khetabNumber; //رقم الخطاب
    private String khetabName; //مرسل الخطاب
    private String khetabDate; //تاريخ الخطاب
}
