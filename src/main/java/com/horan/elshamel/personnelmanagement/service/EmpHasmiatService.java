package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpHasmiatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmiat;

import java.util.List;

public interface EmpHasmiatService extends BaseService<Long,EmpHasmiat> {


    List<EmpHasmiatSearchDto> searchHasmiat(String name, String cardId);

//    List<EmpHasmiat> findAll();
//
//    EmpHasmiat save(EmpHasmiat dto);
//
//    EmpHasmiat update(EmpHasmiat dto);
//
//    void delete(long id);
}
