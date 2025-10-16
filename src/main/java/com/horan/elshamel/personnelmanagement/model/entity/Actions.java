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
    private Long id;

    @Column(name = "ACTION", length = 500)
    private String action;

    @Column(name = "DAT", length = 50)
    private LocalDate dat;

    @Column(name = "TIM", length = 50)
    private String tim;

    @Column(name = "USERNAME", length = 150)
    private String username;

}
