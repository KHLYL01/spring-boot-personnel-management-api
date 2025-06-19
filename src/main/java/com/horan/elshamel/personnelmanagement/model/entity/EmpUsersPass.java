package com.horan.elshamel.personnelmanagement.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_USERS_PASS")
public class EmpUsersPass{

    @EmbeddedId
    private EmpUsersPassKey key;

//    @Column(name = "ID", length = 100)
//    private BigDecimal id;

    @Column(name = "NAME", length = 100)
    private String name;

    @Column(name = "PASS", length = 100)
    private String pass;

//    @Column(name = "MENUS", length = 200)
//    private String menus;

    @Column(name = "EMP_NAME", length = 150)
    private String empName;

    @Column(name = "SAVE", precision = 20, scale = 5)
    private BigDecimal save;

    @Column(name = "EDIT", precision = 20, scale = 5)
    private BigDecimal edit;

    @Column(name = "DEL", precision = 20, scale = 5)
    private BigDecimal del;

    @Column(name = "MOSTAHAKA", precision = 38, scale = 0)
    private BigDecimal mostahaka;

    @Column(name = "DIRECTBOSS", precision = 38, scale = 0)
    private BigDecimal directBoss;

    @Column(name = "SALAHEA", precision = 38, scale = 0)
    private BigDecimal salahea;

    @Column(name = "EMPID", precision = 18, scale = 0)
    private BigDecimal empId;

    @Column(name = "MAJLESS", precision = 38, scale = 0)
    private BigDecimal majless;
}
