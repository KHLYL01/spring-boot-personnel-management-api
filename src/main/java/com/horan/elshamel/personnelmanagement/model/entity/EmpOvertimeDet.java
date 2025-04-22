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
@Table(name = "EMP_OVERTIME_DET")
public class EmpOvertimeDet extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "OVERTIMEID")
    private Long overtimeId;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "EMPWORK", length = 100)
    private String empWork;

    @Column(name = "PERIOD", precision = 10)
    private Integer period;

}
