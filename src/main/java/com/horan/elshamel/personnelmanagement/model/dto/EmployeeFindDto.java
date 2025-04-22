package com.horan.elshamel.personnelmanagement.model.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmployeeFindDto {

    private Long id; // رقم الموظف
    private String name; // اسم الموظف
    private String fia; // المرتبة
    private BigDecimal draga; // الدرجة
    private BigDecimal salary; // الراتب
    private BigDecimal naqlBadal; // بدل النقل
    private BigDecimal intentedabBadal; // بدل الإنتداب
    private String empType; // نوع الوظيفة
    private Long badal1;
    private Long badal2;
    private Long badal3;
    private Long badal4;
    private BigDecimal jobBadalat;
    private BigDecimal maeesha;

}
