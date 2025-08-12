package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpMokhalfatDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpMokhalfatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfat;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfatDet;

import java.util.List;

public interface EmpMokhalfatService extends BaseService<Long,EmpMokhalfat> {

    List<EmpMokhalfatSearchDto> searchMokhalfat(String name,String cardId);

    List<EmpMokhalfatDetDto> getMokhalfatDetByMokhalfatId(Long mokhalfaId);

    EmpMokhalfatDet saveMokhalfatDet(EmpMokhalfatDet empMokhalfatDet);

    void deleteMokhalfatDetById(Long id);

    Long getNextDetId();

}
