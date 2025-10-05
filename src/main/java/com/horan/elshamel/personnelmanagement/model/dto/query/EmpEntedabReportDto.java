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
public class EmpEntedabReportDto {

    private Long id;                     // EMP_ENTEDAB.ID
    private String employeeName;         // الاسم
    private String jobTitle;             // مسمى الوظيفة
    private String fia;
    private String entedabPlace;         // جهة الإنتداب
    private String task;
    private Long period;                 // المدة
    private String assignmentStartDate;// تاريخ بداية الإنتداب
    private Long prevPeriod = 0L;
    private Long sumPeriod = 0L;
    private Long empId;
    private Date dateBeginGo;

    public EmpEntedabReportDto(Long id, String employeeName, String jobTitle, String fia, String entedabPlace, String task, Long period, String assignmentStartDate, Long empId, Date dateBeginGo) {
        this.id = id;
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.fia = fia;
        this.entedabPlace = entedabPlace;
        this.task = task;
        this.period = period;
        this.assignmentStartDate = assignmentStartDate;
        this.empId = empId;
        this.dateBeginGo = dateBeginGo;
    }
}
