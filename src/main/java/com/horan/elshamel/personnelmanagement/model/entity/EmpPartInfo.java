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
@Table(name = "EMP_PARTINFO")
public class EmpPartInfo extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "PARTBOSS")
    private String partBoss;

    @Column(name = "PART2BOSS")
    private String part2Boss;

    @Column(name = "MALIABOSS")
    private String maliaBoss;

    @Column(name = "EMP")
    private String emp;

    @Column(name = "EMPHELP")
    private String empHelp;

    @Column(name = "MA3ESHA")
    private Long ma3esha;

    @Column(name = "WORKSTATIONBOSS")
    private String workStationBoss;

//    @Column(name = "EDARIABOSS")
//    private String edariaBoss;

}
