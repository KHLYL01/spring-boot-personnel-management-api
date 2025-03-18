package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BLADIAINFO")
public class BladiaInfo extends BaseEntity<Long> {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "NAMEAR")
    private String nameAr;

    @Column(name = "BOSS")
    private String boss;

    @Lob
    @Column(name = "LOGO")
    private byte[] logo;

    @Column(name = "IPAN")
    private String ipan;

    @Column(name = "DATBEGIN")
    private String datBegin;

    @Column(name = "DATEND")
    private String datEnd;

//    @Column(name = "NAMEEN")
//    private String nameEn;

//    @Column(name = "BOSS_ASSISTANT")
//    private String bossAssistant;

//    @Column(name = "SECTIONNO")
//    private String sectionNo;

//    @Column(name = "DEPARTNO")
//    private String departNo;

//    @Column(name = "QARARNO")
//    private String qararNo;

//    @Column(name = "QARARDATE")
//    private String qararDate;

//    @Column(name = "MANTEQA")
//    private String manteqa;

//    @Column(name = "AMANA")
//    private String amana;


}
