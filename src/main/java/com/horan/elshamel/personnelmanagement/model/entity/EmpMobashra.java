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
@Table(name = "EMP_MOBASHRA")
public class EmpMobashra extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "QRARID", length = 100)
    private String qrarId;

    @Column(name = "DATQRAR", length = 15)
    private String qrarDateString;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "DATHOLIDAYBEGIN", length = 15)
    private String holidayStartDate;

    @Column(name = "DATHOLIDAYEND", length = 15)
    private String holidayEndDate;

    @Column(name = "PERIOD", precision = 10, scale = 5)
    private BigDecimal period;

    @Column(name = "DATKHETAB", length = 15)
    private String khetabDate;

    @Column(name = "PARTBOSS", length = 300)
    private String partBoss;

    @Column(name = "DATMOBASHRA", length = 15)
    private String mobashraDate;

    @Column(name = "DAY", length = 20)
    private String day;

    @Column(name = "NOTES", length = 300)
    private String notes;

    @Column(name = "DATQRARGO")
    @Temporal(TemporalType.DATE)
    private Date qrarDate;

    @Column(name = "DATMOBASHRAGO")
    @Temporal(TemporalType.DATE)
    private Date mobashraDateGo;

    @Column(name = "DATEND", length = 15)
    private String endDate;

    @Column(name = "DAYS", precision = 10, scale = 5)
    private BigDecimal days;

    @Column(name = "FORR", length = 150)
    private String forr;

    // Audit fields
    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "PROGRAMUSER", length = 150)
    private String programUser;

    @Column(name = "INDATE", length = 150)
    private String inputDate;

    @Column(name = "KHETABNO", length = 150)
    private String khetabNo;

    @Column(name = "DAT", length = 50)
    private String date;

    @Column(name = "NO", length = 20)
    private String no;

}
