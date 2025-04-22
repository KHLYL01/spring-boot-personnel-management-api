package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpMokhalfatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfat;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpMokhalfatService extends BaseService<Long,EmpMokhalfat> {

    List<EmpMokhalfatSearchDto> searchMokhalfat(String name,String cardId);

}
