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
@Table(name = "EMP_ENDEMP")
public class EmpEndEmp extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "QRARID", length = 100)
    private String qrarId;

    @Column(name = "DATQRAR", length = 15)
    private String qrarDate;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "DATEND", length = 15)
    private String endDate;

    @Column(name = "DAYS", length = 50)
    private String days;

    @Column(name = "REWARD", precision = 38)
    private Long reward;

    @Column(name = "TAQA7D", precision = 38)
    private Long taqa7d;

    @Column(name = "DATBIRTH", length = 15)
    private String birthDate;

    @Column(name = "AGE", precision = 3)
    private Integer age;

    @Column(name = "REWARD1", precision = 10)
    private Integer reward1;

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
