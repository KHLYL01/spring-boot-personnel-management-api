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
@Table(name = "EMP_DEGREES")
public class EmpDegrees extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "TYPE", precision = 20)
    private BigDecimal type;

    @Column(name = "MARTABA", precision = 20)
    private BigDecimal martaba;

    @Column(name = "DRAGA", precision = 20)
    private BigDecimal draga;

    @Column(name = "SALARY", precision = 20)
    private BigDecimal salary;

    @Column(name = "NAQLBADAL", precision = 20)
    private BigDecimal naqlBadal;

    @Column(name = "ELAWA", precision = 20)
    private BigDecimal elawa;

    @Column(name = "INENTEDABBADAL", precision = 20)
    private BigDecimal inEntedabBadal;

    @Column(name = "OUTENTEDABBADAL", precision = 20)
    private BigDecimal outEntedabadal;

}
