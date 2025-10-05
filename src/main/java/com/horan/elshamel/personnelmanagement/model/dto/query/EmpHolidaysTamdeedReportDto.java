package com.horan.elshamel.personnelmanagement.model.dto.query;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpHolidaysTamdeedReportDto {
    private Long sumOfPeriod;
    private int maxId;
    private String tamdeedEnd;

    public EmpHolidaysTamdeedReportDto(Long sumOfPeriod, String tamdeedEnd) {
        this.sumOfPeriod = sumOfPeriod;
        this.tamdeedEnd = tamdeedEnd;
    }
}
