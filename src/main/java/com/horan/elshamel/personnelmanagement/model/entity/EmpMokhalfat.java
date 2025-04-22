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
@Table(name = "EMP_MOKHALFAT")
public class EmpMokhalfat extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "MOKALFATYPE", length = 100)
    private String mokhalfaType;

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

    @Column(name = "BYAN", length = 1000)
    private String description;

    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "PROGRAMUSER", length = 150)
    private String programUser;

    @Column(name = "INDATE", length = 150)
    private String inputDate;

    @Column(name = "DATTALAB", length = 15)
    private String requestDateString;

    @Column(name = "DATTALABGO")
    @Temporal(TemporalType.DATE)
    private Date requestDate;

}
