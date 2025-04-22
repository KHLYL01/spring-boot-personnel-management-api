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
@Table(name = "EMP_HASMIAT")
public class EmpHasmiat extends BaseEntity<Long> {

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

    @Column(name = "MRTABA", length = 100)
    private String mrtaba;

    @Column(name = "DRAGA", precision = 10, scale = 5)
    private BigDecimal draga;

    @Column(name = "SALARY", precision = 10, scale = 5)
    private BigDecimal salary;

    @Column(name = "NAQLBADAL", precision = 10, scale = 5)
    private BigDecimal naqlBadal;

    @Column(name = "GHYAB", precision = 10, scale = 5)
    private BigDecimal ghyab;

    @Column(name = "TAGMEE3", precision = 10, scale = 5)
    private BigDecimal tagmee3;

    @Column(name = "GZA", precision = 10, scale = 5)
    private BigDecimal gza;

    @Column(name = "DATBEGIN", length = 15)
    private String datBegin;

    @Column(name = "DATBEGINGO")
    @Temporal(TemporalType.DATE)
    private Date datBeginGo;

    @Column(name = "DATEND", length = 15)
    private String datEnd;

    @Column(name = "DATENDGO")
    @Temporal(TemporalType.DATE)
    private Date datEndGo;

    @Column(name = "BYAN", length = 350)
    private String byan;

    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "PROGRAMUSER", length = 150)
    private String programUser;

    @Column(name = "INDATE", length = 150)
    private String inDate;

    @Column(name = "MONTH1", length = 50)
    private String month1;

    @Column(name = "MONTH2", length = 50)
    private String month2;

    @Column(name = "YEAR1", length = 50)
    private String year1;

    @Column(name = "YEAR2", length = 50)
    private String year2;

    @Column(name = "DEPENDON", length = 150)
    private String dependOn;

    @Column(name = "FOOTER", length = 4000)
    private String footer;

    @Column(name = "HASMTYPE", length = 50)
    private String hasmType;

}
