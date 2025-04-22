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
@Table(name = "EMP_DAORA")
public class EmpDaora extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "QRARID", length = 100)
    private String qrarId;

    @Column(name = "DATQRAR", length = 15)
    private String qrarDateString;

    @Column(name = "DATQRARGO")
    @Temporal(TemporalType.DATE)
    private Date qrarDate;

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
    private String khetabDateString;

    @Column(name = "DATBEGIN", length = 15)
    private String startDateString;

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
    private Date khetabDate;

    @Column(name = "DATBEGINGO")
    @Temporal(TemporalType.DATE)
    private Date startDate;

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
    private String endDateString;

    @Column(name = "DISTANCE", precision = 10, scale = 3)
    private BigDecimal distance;

    // Audit and additional fields
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
    private String inputDate;

    @Column(name = "THREEDAYS", precision = 38)
    private Long threeDays;

    @Column(name = "ENTEDABTYPE", precision = 38)
    private Long entedabType;

    @Column(name = "BEFOR", precision = 10)
    private Integer before;

    @Column(name = "AFTER", precision = 10)
    private Integer after;

    @Column(name = "PRENTED_ESTEHQAQ", precision = 10)
    private Integer prentedEstehqaq;

    @Column(name = "PRENTED_ERCAB", precision = 38)
    private Long prentedErcab;

    @Column(name = "WASELATSAFAR", length = 150)
    private String waselatSafar;

    @Column(name = "KHAT", length = 150)
    private String khat;

    @Column(name = "DARAGAPLAN", length = 150)
    private String daragaPlan;

    @Column(name = "ESHAAR", length = 150)
    private String eshaar;

    @Column(name = "EXT", precision = 38)
    private Long ext;

    @Column(name = "PERIOD1", precision = 38)
    private Long period1;

    @Column(name = "CITY", length = 20)
    private String city;

    @Column(name = "TYPE", length = 20)
    private String type;

    @Column(name = "MONEY", precision = 20, scale = 2)
    private BigDecimal money;

    @Column(name = "FINISH", precision = 38)
    private Long finish;

    @Column(name = "MOHTARAMEEN", length = 150)
    private String mohtarameen;
}
