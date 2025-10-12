package com.horan.elshamel.personnelmanagement.model.dto.query;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpHolidaysTamdeedFilterDto {
    private Long sumOfPeriod;
    private int maxId;
    private String tamdeedEnd;

    public EmpHolidaysTamdeedFilterDto(Long sumOfPeriod, String tamdeedEnd) {
        this.sumOfPeriod = sumOfPeriod;
        this.tamdeedEnd = tamdeedEnd;
    }
}
