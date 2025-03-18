package com.horan.elshamel.personnelmanagement.model.dto;

import com.horan.elshamel.personnelmanagement.model.entity.BladiaInfo;
import com.horan.elshamel.personnelmanagement.model.entity.EmpPartInfo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BladiaInfoWithEmpPartInfoDto {

    private BladiaInfo bladiaInfo;
    private EmpPartInfo empPartInfo;

}
