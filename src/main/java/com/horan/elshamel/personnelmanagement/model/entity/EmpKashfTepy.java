package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_KASHFTEPY")
public class EmpKashfTepy extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "DATTALAB", length = 15)
    private String requestDateString;

    @Column(name = "DATTALABGO")
    @Temporal(TemporalType.DATE)
    private Date requestDate;

    @Column(name = "WEHDATYPE", length = 100)
    private String wehdaType;

    @Column(name = "WEHDANAME", length = 250)
    private String wehdaName;

    @Column(name = "NOTES", length = 250)
    private String notes;

    @Column(name = "EMPSTATUS", length = 100)
    private String employeeStatus;

    @Column(name = "DATENKETA3", length = 15)
    private String endDateString;

    @Column(name = "DATENKETA3GO")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    // Audit fields
    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "PROGRAMUSER", length = 150)
    private String programUser;

    @Column(name = "INDATE", length = 150)
    private String inputDate;

}
