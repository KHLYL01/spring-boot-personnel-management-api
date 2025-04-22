package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_DOWRA")
public class EmpDowra extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;


    @Column(name = "TITLE", length = 300)
    private String title;

    @Column(name = "FOOTER", length = 4000)
    private String footer;

    @Column(name = "DOWRA_DAYS")
    private Integer courseDays;

    @Column(name = "EXTRA_DAYS")
    private Integer extraDays;

    @Column(name = "COUNTRYID")
    private Long countryId;

    @Column(name = "DATBEGIN", length = 50)
    private String startDate;

    @Column(name = "DATEND", length = 50)
    private String endDate;

    @Column(name = "QRARID", length = 4000)
    private String decisionNumber;

    @Column(name = "DATQRAR", length = 50)
    private String decisionDate;

}
