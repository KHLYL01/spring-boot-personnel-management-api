package com.horan.elshamel.personnelmanagement.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_MOKHALFAT_DET")
public class EmpMokhalfatDet {

    @Id
    @Column(name = "MAXID")
    private Long maxId;

    @Column(name = "MOKHALFAID")
    private Long mokhalfaId;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "GZA", precision = 10, scale = 5)
    private BigDecimal gza;

}
