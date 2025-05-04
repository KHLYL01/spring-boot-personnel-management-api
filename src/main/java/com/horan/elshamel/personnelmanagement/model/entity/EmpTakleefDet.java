package com.horan.elshamel.personnelmanagement.model.entity;

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
@Table(name = "EMP_TAKLEEF_DET")
public class EmpTakleefDet {

    @Id
    @Column(name = "MAXID")
    private Long maxId;

    @Column(name = "TAKLEEFID")
    private Long takleefId;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "EMPWORK", length = 100)
    private String empWork;

    @Column(name = "PERIOD", precision = 10, scale = 0)
    private BigDecimal period;

    @Column(name = "DATBEGIN", length = 50)
    private String datBegin;

    @Column(name = "DATBEGINGO")
    @Temporal(TemporalType.DATE)
    private Date datBeginGo;

    @Column(name = "DATEND", length = 50)
    private String datEnd;

    @Column(name = "DATENDGO")
    @Temporal(TemporalType.DATE)
    private Date datEndGo;
}

