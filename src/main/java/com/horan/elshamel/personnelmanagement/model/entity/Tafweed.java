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
@Table(name = "TAFWEED")
public class Tafweed extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "SUBJECT", length = 300)
    private String subject;

    @Column(name = "EMPID", precision = 10)
    private Long empId;

    @Column(name = "DAY", length = 20)
    private String day;

    @Column(name = "DATBEGIN", length = 50)
    private String startDate;

    @Column(name = "DATEND", length = 50)
    private String endDate;

    @Column(name = "NOTE", length = 500)
    private String note;

    // Audit fields
    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "PROGRAMUSER", length = 50)
    private String programUser;

    @Column(name = "INDATE", length = 50)
    private String inputDate;

}
