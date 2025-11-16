package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_HOLIDAYS_CUT")
public class EmpHolidaysCut extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "HOLIDAYS_ID", nullable = false)
    private Long holidaysId;

    @Column(name = "HOLIDAYTYPE")
    private Integer holidayType;

    @Column(name = "OLD_PERIOD", nullable = false)
    private Integer oldPeriod;

    @Column(name = "NEW_PERIOD", nullable = false)
    private Integer newPeriod;

}
