package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
public class Actions extends BaseEntity<Long> {

    @Column(name = "USERNAME", length = 20)
    private String username;

    @Column(name = "DAT")
    private LocalDate dat; // Replaced java.util.Date with LocalDate

    @Column(name = "ACTION",columnDefinition = "TEXT")
    private String action;

    @Column(name = "TIM")
    private LocalTime tim;

}
