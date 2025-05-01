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
@Table(name = "EMP_HASM_DET")
public class EmpHasmDet{

    @Id
    @Column(name = "MAXID")
    private Long maxId;

    @Column(name = "HASMID")
    private Long hasmId;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "GHYAB", precision = 10, scale = 5)
    private BigDecimal ghyab;

    @Column(name = "TAGMEE3", precision = 10, scale = 5)
    private BigDecimal tagmee3;

    @Column(name = "GZA", precision = 10, scale = 5)
    private BigDecimal gza;

    @Column(name = "DETAILS", length = 300)
    private String details;

    @Column(name = "MIN", length = 50)
    private String min;

    @Column(name = "NOTES", length = 50)
    private String notes;

    @Column(name = "MOSTA7QTOTAL")
    private Long mosta7qTotal;

}
