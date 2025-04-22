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
@Table(name = "EMP_EQRAR")
public class EmpEqrar extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;


    @Column(name = "KHETAB_NO", precision = 10)
    private Long letterNumber;

    @Column(name = "KHETAB_NAME", length = 150)
    private String letterName;

    @Column(name = "EQRAR_NAME", length = 150)
    private String decisionName;

    @Column(name = "EQRAR_PLACE", length = 150)
    private String decisionPlace;

    @Column(name = "EQRAR_DATE", length = 15)
    private String decisionDate;

    @Column(name = "KHETAB_DATE", length = 15)
    private String letterDate;

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
