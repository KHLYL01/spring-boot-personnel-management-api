package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTarqeaSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTarqea;

import java.util.List;

public interface EmpTarqeaService extends BaseService<Long,EmpTarqea> {

    List<EmpTarqeaSearchDto> searchTarqea(String qrarId, String name);

}
