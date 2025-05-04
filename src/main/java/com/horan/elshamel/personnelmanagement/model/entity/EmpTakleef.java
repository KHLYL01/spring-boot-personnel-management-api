package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_TAKLEEF")
public class EmpTakleef extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "QRARID", length = 100)
    private String qrarId;

    @Column(name = "DATQRAR", length = 15)
    private String datQrar;

    @Column(name = "DATQRARGO")
    @Temporal(TemporalType.DATE)
    private Date datQrarGo;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "PLACE", length = 255)
    private String place;

    @Column(name = "TASK", length = 255)
    private String task;

    @Column(name = "PERIOD")
    private Long period;

    @Column(name = "KHETABID", length = 100)
    private String khetabId;

    @Column(name = "DATKHETAB", length = 15)
    private String datKhetab;

    @Column(name = "DATBEGIN", length = 15)
    private String datBegin;

    @Column(name = "DAY", length = 20)
    private String day;

    @Column(name = "HOURSAVG", precision = 10, scale = 5)
    private BigDecimal hoursAvg;

    @Column(name = "DATKHETABGO")
    @Temporal(TemporalType.DATE)
    private Date datKhetabGo;

    @Column(name = "DATBEGINGO")
    @Temporal(TemporalType.DATE)
    private Date datBeginGo;

    @Column(name = "MRTABA", length = 100)
    private String mrtaba;

    @Column(name = "DRAGA", precision = 10, scale = 5)
    private BigDecimal draga;

    @Column(name = "SALARY", precision = 10, scale = 5)
    private BigDecimal salary;

    @Column(name = "NAQLBADAL", precision = 10, scale = 5)
    private BigDecimal naqlBadal;

    @Column(name = "DATEND", length = 15)
    private String datEnd;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "PROGRAMUSER", length = 150)
    private String programUser;

    @Column(name = "INDATE", length = 150)
    private String inDate;

    @Column(name = "PERIODTHERSDAY", precision = 20)
    private Long periodOthersDay;

    @Column(name = "HOURSAVGTHERSDAY", precision = 20, scale = 5)
    private BigDecimal hoursAvgOthersDay;

    @Column(name = "DATENDGO")
    @Temporal(TemporalType.DATE)
    private Date datEndGo;

}
