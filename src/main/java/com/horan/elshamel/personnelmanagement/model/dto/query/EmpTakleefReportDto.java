package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmpTakleefReportDto {

    private Long id;
    private String employeeName;         // الاسم
    private String jobName;              // مسمى الوظيفة
    private String fia;
    private String place;                // مكان العمل (added for filtering)
    private String task;
    private Long period;                 // عدد أيام الخارج الدوام
    private BigDecimal hoursAvg;         // معدل عدد ساعات
    private BigDecimal hoursPeriodTotal;
    private String dateBegin;            // تاريخ بداية الخارج الدوام

    public EmpTakleefReportDto(Long id, String employeeName, String jobName, String fia, String place, String task, Long period, BigDecimal hoursAvg, String dateBegin) {
        this.id = id;
        this.employeeName = employeeName;
        this.jobName = jobName;
        this.fia = fia;
        this.place = place;
        this.task = task;
        this.period = period;
        this.hoursAvg = hoursAvg;
        this.dateBegin = dateBegin;

        if(period != null) {
            hoursPeriodTotal = hoursAvg.multiply(new BigDecimal(period));
        }else {
            hoursPeriodTotal = new BigDecimal(0);
        }

    }
}
