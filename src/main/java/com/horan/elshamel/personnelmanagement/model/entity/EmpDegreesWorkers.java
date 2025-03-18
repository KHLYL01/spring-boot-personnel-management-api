package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_DEGREES_WORKERS")
public class EmpDegreesWorkers extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "FIA")
    private String fia;

    @Column(name = "DRAGA", precision = 20)
    private BigDecimal draga;

    @Column(name = "SALARY", precision = 20)
    private BigDecimal salary;

    @Column(name = "NAQLBADAL", precision = 20)
    private BigDecimal naqlBadal;

    @Column(name = "ELAWA", precision = 20)
    private BigDecimal elawa;

}
