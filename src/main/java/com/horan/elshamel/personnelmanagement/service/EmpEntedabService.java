package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEntedabSearchDto;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpEntedabDetDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedab;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedabDet;

import java.util.List;

public interface EmpEntedabService extends BaseService<Long,EmpEntedab> {


    List<EmpEntedabSearchDto> entedabSearch(String employeeName, String cardId, String entedabPlace);

    List<EmpEntedabDetDto> getEntedabDetByEntedabId(Long entedabId);

    EmpEntedabDet saveEntedabDet(EmpEntedabDet empEntedabDet);

    void deleteEntedabDetById(Long id);

    Long getNextDetId();

}
