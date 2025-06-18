package com.horan.elshamel.personnelmanagement.model.dto.mosaeer;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class GzaSummaryDto {

    private BigDecimal ghyab;
    private BigDecimal tagmee3;
    private Long mosta7qTotal;
    private BigDecimal gza;

    public GzaSummaryDto(BigDecimal ghyab, BigDecimal tagmee3, Long mosta7qTotal, BigDecimal gza) {
        this.ghyab = ghyab == null ? BigDecimal.ZERO : ghyab;
        this.tagmee3 = tagmee3 == null ? BigDecimal.ZERO : tagmee3;
        this.mosta7qTotal = mosta7qTotal == null ? 0L : mosta7qTotal;
        this.gza = gza == null ? BigDecimal.ZERO : gza;
    }
}
