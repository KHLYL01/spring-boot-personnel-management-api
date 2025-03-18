package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_Absent")
public class EmpAbsent extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "EMPID")
//    private Long empId;

    @Column(name = "DATEHJ", length = 20)
    private String dateHj;

    @Column(name = "DATEGR")
    private LocalDate dateGr; // Replaced java.util.Date with LocalDate

    @Column(name = "MINITCOUNT")
    private Long minitCount;

    @Column(name = "HOLIDAY")
    private Long holiday;

    @Column(name = "ENTEDAB")
    private Long entedab;

    @Column(name = "ABSENT")
    private Long absent;

    @Column(name = "THODOR", length = 20)
    private String thodor;

    @Column(name = "TENSERAF", length = 20)
    private String tenseraf;

    @Column(name = "MISSION")
    private Long mission;

    @Column(name = "MACHINENUMBER")
    private Long machineNumber;

    @Column(name = "JOLATMINIT")
    private Long jolatMinit;

    @Column(name = "JOLA")
    private Long jola;

    @Column(name = "TJOLA", length = 20)
    private String tjola;

    @Column(name = "NADBOUT")
    private Long nadbout;

    @Column(name = "EMPGROUP")
    private Long empGroup;

    @Column(name = "COURS")
    private Long cours;
}
