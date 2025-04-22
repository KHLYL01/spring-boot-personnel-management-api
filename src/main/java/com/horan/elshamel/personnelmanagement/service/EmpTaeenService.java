package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpTaeenSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTaeen;

import java.util.List;

public interface EmpTaeenService extends BaseService<Long,EmpTaeen> {

    List<EmpTaeenSearchDto> searchTaeen(String name);

}
