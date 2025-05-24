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
    private Long maxId;

    @Column(name = "DOWRAID")
    private Long dowraId;

    @Column(name = "MOKAFAA")
    private Long mokafaa;

    @Column(name = "BADAL_ENTIDAB")
    private Long badalEntidab;

    @Column(name = "BADAL_TRANSFARE")
    private Long badalTransfare;

    @Column(name = "TICKET_COUST")
    private Long ticketCost;

    @Column(name = "TOTAL")
    private Long total;

    @Column(name = "EMPID")
    private Long empId;

}
