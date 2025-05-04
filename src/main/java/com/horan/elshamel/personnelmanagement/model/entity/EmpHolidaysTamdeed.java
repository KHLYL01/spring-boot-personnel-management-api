package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_HOLIDAYS_TAMDEED")
public class EmpHolidaysTamdeed extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "HOLIDAYS_ID", nullable = false)
    private Long holidaysId;

    @Column(name = "TAMDEEDPERIOD", nullable = false)
    private Integer tamdeedPeriod;

    @Column(name = "TAMDEEDBEGIN", length = 50)
    private String tamdeedBegin;

    @Column(name = "TAMDEEDEND", length = 50)
    private String tamdeedEnd;

    @Column(name = "TEPYNO", length = 250)
    private String tepyNo;

    @Column(name = "TEPYDATE", length = 50)
    private String tepyDate;

    @Column(name = "HOSPITAL", length = 150)
    private String hospital;

    @Column(name = "HOLIDAYTYPE")
    private Integer holidayType;

    @Column(name = "TAMDEEDBEGIN_GO")
    @Temporal(TemporalType.DATE)
    private Date tamdeedBeginGo;

    @Column(name = "TAMDEEDEND_GO")
    @Temporal(TemporalType.DATE)
    private Date tamdeedEndGo;

    @Column(name = "TEPYDATE_GO")
    @Temporal(TemporalType.DATE)
    private Date tepyDateGo;

}
