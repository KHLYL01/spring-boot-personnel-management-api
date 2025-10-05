package com.horan.elshamel.personnelmanagement.model.dto.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpHolidaysReportDto {

    private Long id;                     // EMP_HOLIDAYS.ID
    private String employeeName;         // الاسم
    private String jobName;             // مسمى الوظيفة
    private Date startDate;              // EMP_HOLIDAYS.DATBEGINGO
    private String fia;
    private BigDecimal draga;
    private Integer holidayTypeId;          // نوع الإجازة
    private String holidayType;
    private BigDecimal period;           // مدة الإجازة
    private Integer tamdeedPeriod;
    private String tamdeedStartDate;
    private String tamdeedEndDate;
    private String holidayStartDate;     // تاريخ بداية الإجازة
    private String holidayEndDate;       // تاريخ انتهاء الاجازة

    public EmpHolidaysReportDto(Long id, String employeeName, String jobName, Date startDate, String fia, BigDecimal draga, Integer holidayTypeId, BigDecimal period, Integer tamdeedPeriod, String tamdeedStartDate, String tamdeedEndDate, String holidayStartDate, String holidayEndDate) {
        this.id = id;
        this.employeeName = employeeName;
        this.jobName = jobName;
        this.startDate = startDate;
        this.fia = fia;
        this.draga = draga;
        this.holidayTypeId = holidayTypeId;
        this.period = period;
        this.tamdeedPeriod = tamdeedPeriod;
        this.tamdeedStartDate = tamdeedStartDate;
        this.tamdeedEndDate = tamdeedEndDate;
        this.holidayStartDate = holidayStartDate;
        this.holidayEndDate = holidayEndDate;
    }
}
