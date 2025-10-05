package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.base.BaseService;
import com.horan.elshamel.personnelmanagement.model.dto.query.TafweedSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Tafweed;

import java.util.List;

public interface TafweedService extends BaseService<Long,Tafweed> {


    List<TafweedSearchDto> searchTafweed(Long empId);

    List<TafweedSearchDto> reportTafweed(Long empId);
}
