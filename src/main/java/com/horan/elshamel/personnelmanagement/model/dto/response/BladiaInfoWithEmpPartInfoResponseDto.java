package com.horan.elshamel.personnelmanagement.model.dto.response;

import com.horan.elshamel.personnelmanagement.model.entity.BladiaInfo;
import com.horan.elshamel.personnelmanagement.model.entity.EmpPartInfo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BladiaInfoWithEmpPartInfoResponseDto {

    private BladiaInfo bladiaInfo;
    private EmpPartInfo empPartInfo;

}
