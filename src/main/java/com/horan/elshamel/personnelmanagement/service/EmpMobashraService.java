package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpMobashraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMobashra;

import java.util.List;

public interface EmpMobashraService extends BaseService<Long,EmpMobashra> {

    List<EmpMobashraSearchDto> searchMobashra(String name, String cardId, String empType);

}
