package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpHasmiatDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.EmpMokhalfatDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.EmpMokhalfatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmDet;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfat;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfatDet;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpMokhalfatService extends BaseService<Long,EmpMokhalfat> {

    List<EmpMokhalfatSearchDto> searchMokhalfat(String name,String cardId);

    List<EmpMokhalfatDetDto> getMokhalfatDetByMokhalfatId(Long mokhalfaId);

    EmpMokhalfatDet saveMokhalfatDet(EmpMokhalfatDet empMokhalfatDet);

    void deleteMokhalfatDetById(Long id);

    Long getNextDetId();

}
