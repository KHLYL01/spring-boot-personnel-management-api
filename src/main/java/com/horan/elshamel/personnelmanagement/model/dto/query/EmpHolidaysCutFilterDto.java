package com.horan.elshamel.personnelmanagement.model.dto.query;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpHolidaysCutFilterDto {
    private Long sumOfPeriod;
    private int id;

    public EmpHolidaysCutFilterDto(Long sumOfPeriod) {
        this.sumOfPeriod = sumOfPeriod;
    }
}
