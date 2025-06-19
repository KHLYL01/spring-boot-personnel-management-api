package com.horan.elshamel.personnelmanagement.model.dto;

import com.horan.elshamel.personnelmanagement.model.entity.EmpUsersPassKey;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class UserDto {

    private BigDecimal id;
    private String name;
    private String pass;
    private String empName;

}
