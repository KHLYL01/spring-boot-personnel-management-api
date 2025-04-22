package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpDowraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowra;

import java.util.List;

public interface EmpDowraService extends BaseService<Long,EmpDowra> {


    List<EmpDowraSearchDto> searchDowra(String name, String cardId);

}
