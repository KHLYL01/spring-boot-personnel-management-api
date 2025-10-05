package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpTakleefDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleefDet;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleef;

import java.util.Date;
import java.util.List;

public interface EmpTakleefService extends BaseService<Long, EmpTakleef> {
    List<EmpTakleefSearchDto> searchTakleef(String name, String cardId, String place);

    List<EmpTakleefReportDto> reportTakleef(boolean all, Long empId, Date fromDate, Date toDate);

    List<EmpTakleefDetDto> getTakleefDetByTakleefId(Long takleefId);

    EmpTakleefDet saveTakleefDet(EmpTakleefDet empTakleefDet);

    void deleteTakleefDetById(Long id);

    Long getNextDetId();

}
