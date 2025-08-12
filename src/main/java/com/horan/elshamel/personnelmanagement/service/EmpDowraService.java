package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpDowraDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpDowraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowra;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowraDet;

import java.util.List;

public interface EmpDowraService extends BaseService<Long,EmpDowra> {

    List<EmpDowraSearchDto> searchDowra(String name, String cardId);

    List<EmpDowraDetDto> getDowraDetByDowraId(Long dowraId);

    EmpDowraDet saveDowraDet(EmpDowraDet empDowraDet);

    void deleteDowraDetById(Long id);

    Long getNextDetId();

}
