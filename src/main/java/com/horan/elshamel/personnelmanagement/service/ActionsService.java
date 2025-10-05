package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEndEmpSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Actions;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEndEmp;

import java.time.LocalDate;
import java.util.List;

public interface ActionsService extends BaseService<Long, Actions> {

    List<Actions> search(Long id, String username, String type, String action,
                         boolean all, LocalDate fromDate, LocalDate toDate);

}
