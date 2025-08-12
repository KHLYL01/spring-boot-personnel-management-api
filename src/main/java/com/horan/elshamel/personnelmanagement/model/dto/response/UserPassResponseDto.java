package com.horan.elshamel.personnelmanagement.model.dto.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class UserPassResponseDto {

    private BigDecimal id;
    private String name;
    private String pass;
    private String empName;

}
