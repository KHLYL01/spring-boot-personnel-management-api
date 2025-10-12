package com.horan.elshamel.personnelmanagement.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ACTIONS")
public class Actions {

    @Id
    @Column(name = "ID")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "action_seq_gen"
    )
    @SequenceGenerator(
            name = "action_seq_gen",
            sequenceName = "ACTION_SEQ", // هذا هو اسم الـ SEQUENCE الفعلي في قاعدة بيانات أوراكل
            allocationSize = 1 // يجب أن يتطابق هذا الرقم مع INCREMENT BY في الـ SEQUENCE
    )
    private Long id;

    @Column(name = "USERNAME", length = 20)
    private String username;

    @Column(name = "DAT")
    private LocalDate dat; // Replaced java.util.Date with LocalDate

    @Column(name = "ACTION",columnDefinition = "CLOB")
    private String action;

    @Column(name = "TIM")
    private LocalTime tim;

}
