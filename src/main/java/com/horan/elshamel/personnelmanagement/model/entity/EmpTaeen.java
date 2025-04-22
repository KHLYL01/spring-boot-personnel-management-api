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
@Table(name = "EMP_TAEEN")
public class EmpTaeen extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "QRARID", length = 100)
    private String qrarId;

    @Column(name = "DATQRAR", length = 15)
    private String qrarDate;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "DATBIRTH", length = 15)
    private String birthDate;

    @Column(name = "STATE", precision = 38)
    private Long state;

    @Column(name = "GENDER", precision = 38)
    private Long gender;

    @Column(name = "SOCIALNO", length = 150)
    private String socialNumber;

    @Column(name = "KHETABID", length = 100)
    private String khetabId;

    @Column(name = "DATKHETAB", length = 15)
    private String khetabDate;

    @Column(name = "KHETABNAME", length = 250)
    private String khetabName;

    @Column(name = "M_DATKHETAB", length = 15)
    private String mKhetabDate;

    @Column(name = "M_DAY", length = 50)
    private String mDay;

}
