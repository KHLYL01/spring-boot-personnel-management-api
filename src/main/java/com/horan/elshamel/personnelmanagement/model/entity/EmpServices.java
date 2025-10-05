package com.horan.elshamel.personnelmanagement.model.entity;

import lombok.*;

import jakarta.persistence.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SERVICES")
public class EmpServices{

    @Id
    private Long id;

    @Column(name = "empId")
    private Long empId;

    @Column(name = "job")
    private String job;

    @Column(name = "martaba")
    private String martaba;

    @Column(name = "m_num")
    private String mNum;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "place")
    private String place;

    @Column(name = "dat_b")
    private String datB;

    @Column(name = "dat_e")
    private String datE;

    @Column(name = "reasons")
    private String reasons;

    @Column(name = "amr_no")
    private String amrNo;

    @Column(name = "dat_amr")
    private String datAmr;

    @Column(name = "nots")
    private String nots;
}