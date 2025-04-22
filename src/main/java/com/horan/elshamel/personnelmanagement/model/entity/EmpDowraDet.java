package com.horan.elshamel.personnelmanagement.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_DOWRA_DET")
public class EmpDowraDet {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "DOWRAID")
    private Long dowraId;

    @Column(name = "MOKAFAA")
    private Long compensation;

    @Column(name = "BADAL_ENTIDAB")
    private Long delegationAllowance;

    @Column(name = "BADAL_TRANSFARE")
    private Long transportationAllowance;

    @Column(name = "TICKET_COUST")
    private Long ticketCost;

    @Column(name = "TOTAL")
    private Long totalAmount;

    @Column(name = "EMPID")
    private Long empId;

}
