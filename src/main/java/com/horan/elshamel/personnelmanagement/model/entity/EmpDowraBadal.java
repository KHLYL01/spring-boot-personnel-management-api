package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_DOWRA_BADAL")
public class EmpDowraBadal extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "MARTABA")
    private Long martaba;

    @Column(name = "CLASS_A")
    private Long classA;

    @Column(name = "CLASS_B")
    private Long classB;

    @Column(name = "CLASS_C")
    private Long classC;

    @Column(name = "INTERNAL")
    private Long internal;

    @Column(name = "HIGH_LIVING")
    private Long highLiving;
}
