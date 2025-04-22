package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.EmpOvertimeSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpOvertime;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpOvertimeService extends BaseService<Long,EmpOvertime> {
    List<EmpOvertimeSearchDto> searchOvertime(String name, String cardId, String place);
}
