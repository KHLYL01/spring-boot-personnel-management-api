package com.horan.elshamel.personnelmanagement.model.entity;

import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class EmpUsersPassKey implements Serializable {

    private BigDecimal id;
    private String menus;

    public EmpUsersPassKey() {}

    public EmpUsersPassKey(BigDecimal id, String menus) {
        this.id = id;
        this.menus = menus;
    }


    // Getters & Setters
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMenus() {
        return menus;
    }

    public void setMenus(String menus) {
        this.menus = menus;
    }

    // equals & hashCode (مهم جدًا)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpUsersPassKey)) return false;
        EmpUsersPassKey that = (EmpUsersPassKey) o;
        return Objects.equals(id, that.id) &&
               Objects.equals(menus, that.menus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, menus);
    }
}