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
@Table(name = "EMP_ENTEDAB")
public class EmpEntedab extends BaseEntity<Long> {

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

    @Column(name = "TASKRAVALUE", precision = 10, scale = 5)
    private BigDecimal taskRaValue;

    @Column(name = "SARF", precision = 38)
    private Long sarf;

    @Column(name = "TASKRA", precision = 38)
    private Long taskRa;

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

    @Column(name = "ENTEDABBADAL", precision = 10, scale = 5)
    private BigDecimal entedabBadal;

    @Column(name = "DATEND", length = 15)
    private String datEnd;

    @Column(name = "WASELTSAFAR", length = 20)
    private String waselTsafar;

    @Column(name = "DISTANCE", precision = 10, scale = 3)
    private BigDecimal distance;

    @Column(name = "QUESTION1", precision = 38)
    private Long question1;

    @Column(name = "QUESTION2", precision = 38)
    private Long question2;

    @Column(name = "QUESTION3", precision = 38)
    private Long question3;

    @Column(name = "QUESTION4", precision = 38)
    private Long question4;

    @Column(name = "QUESTION5", precision = 38)
    private Long question5;

    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "PROGRAMUSER", length = 150)
    private String programUser;

    @Column(name = "INDATE", length = 150)
    private String inDate;

    @Column(name = "THREEDAYS", precision = 38)
    private Long threeDays;

    @Column(name = "ENTEDABTYPE", precision = 38)
    private Long entedabType;

    @Column(name = "PRENTED_ESTEHQAQ", precision = 10)
    private Long prentedEstehqaq;

    @Column(name = "PRENTED_ERCAB", precision = 38)
    private Long prentedErcab;

    @Column(name = "WASELATSAFAR", length = 150)
    private String waselatSafar;

    @Column(name = "PRENTED_ERCA", precision = 38)
    private Long prentedErca;

    @Column(name = "KHAT", length = 150)
    private String khat;

    @Column(name = "DARAGAPLAN", length = 150)
    private String daragaPlan;

    @Column(name = "ESHAAR", length = 150)
    private String eshaar;

    @Column(name = "EXT", precision = 38)
    private Long ext;

    @Column(name = "BEFOR", precision = 10)
    private Long before;

    @Column(name = "AFTER", precision = 10)
    private Long after;

    @Column(name = "TYPE", length = 50)
    private String type;

    @Column(name = "FIA", length = 150)
    private String fia;

    @Column(name = "FIAMONY", precision = 10, scale = 2)
    private BigDecimal fiaMony;

    @Column(name = "DATENDGO")
    @Temporal(TemporalType.DATE)
    private Date datEndGo;

}
