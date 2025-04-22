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
@Table(name = "EMP_HOLIDAYS")
public class EmpHolidays extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

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

    @Column(name = "DATTALAB", length = 15)
    private String requestDateString;

    @Column(name = "DATTALABGO")
    @Temporal(TemporalType.DATE)
    private Date requestDate;

    @Column(name = "HOLIDAYTYPE")
    private Integer holidayType;

    @Column(name = "PERIOD", precision = 10, scale = 5)
    private BigDecimal period;

    @Column(name = "ADRESS", length = 250)
    private String address;

    @Column(name = "SARF")
    private Integer sarf;

    @Column(name = "BOSS", length = 200)
    private String boss;

    @Column(name = "BOSSJOB", length = 200)
    private String bossJob;

    @Column(name = "QRARID", length = 100)
    private String qrarId;

    @Column(name = "DATQRAR", length = 15)
    private String qrarDateString;

    @Column(name = "DATQRARGO")
    @Temporal(TemporalType.DATE)
    private Date qrarDate;

    @Column(name = "DATBEGIN", length = 15)
    private String startDateString;

    @Column(name = "DATBEGINGO")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "DATEND", length = 15)
    private String endDateString;

    @Column(name = "DATENDGO")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "DATESTE7QAQBEGIN", length = 15)
    private String eligibilityStartDate;

    @Column(name = "DATESTE7QAQEND", length = 15)
    private String eligibilityEndDate;

    @Column(name = "DATENFEKAK", length = 15)
    private String separationDate;

    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "PROGRAMUSER", length = 150)
    private String programUser;

    @Column(name = "INDATE", length = 150)
    private String inputDate;

    // Continue with all remaining fields...
    @Column(name = "TEBYPLACE", length = 150)
    private String tebyPlace;

    @Column(name = "TEBYBASE", length = 150)
    private String tebyBase;

    @Column(name = "FORR", length = 250)
    private String forr;

    @Column(name = "PREV", precision = 10)
    private Integer prev;

    @Column(name = "SEJEL", length = 50)
    private String sejel;

    @Column(name = "DATSEJEL", length = 50)
    private String sejelDate;

    @Column(name = "MORAFEQ", length = 50)
    private String morafeq;

    @Column(name = "ESABA", length = 150)
    private String esaba;

    @Column(name = "TAMDEEDPERIOD", precision = 10)
    private Integer extensionPeriod;

    @Column(name = "TAMDEEDBEGIN", length = 50)
    private String extensionStartDate;

    @Column(name = "BADEEL", length = 150)
    private String badeel;

    @Column(name = "MOSTAHAKA", precision = 38)
    private Long mostahaka;

    @Column(name = "DIRECTBOSS", precision = 38)
    private Long directBoss;

    @Column(name = "SALAHEA", precision = 38)
    private Long salahea;

    @Column(name = "CAR", precision = 38)
    private Long car;

    @Column(name = "CARTASLEEM", precision = 38)
    private Long carTasleem;

    @Column(name = "SPARE", length = 250)
    private String spare;

    @Column(name = "FILENO", length = 20)
    private String fileNo;

    @Column(name = "TAMDEEDEND", length = 50)
    private String extensionEndDate;

    @Column(name = "CANCEL")
    private Integer cancel;

    @Column(name = "TEPYNO", length = 50)
    private String tepyNo;

    @Column(name = "TEPYDATE", length = 50)
    private String tepyDate;

    @Column(name = "HOSPITAL", length = 150)
    private String hospital;

    @Column(name = "ETEMAD")
    private Integer etemad;

    @Column(name = "EDARA", length = 200)
    private String edara;

    @Column(name = "FOOTER", length = 4000)
    private String footer;

    @Column(name = "DATTALABYEAR", length = 20)
    private String requestYear;

    @Column(name = "HOLIDAY_YEAR")
    private Integer holidayYear;

    @Column(name = "HOLIDAY_YEARTAMDEED")
    private Integer holidayYearExtension;

    @Column(name = "HOLIDAY_CATEGORY")
    private Integer holidayCategory;

    @Column(name = "HOLIDAY_CATEGORYTAMDEED")
    private Integer holidayCategoryExtension;

}
