package com.horan.elshamel.personnelmanagement.base;

import org.mapstruct.MappingTarget;

import java.util.List;

public interface BaseMapper<T , ID extends Number> {

//    RESPONSE_DTO toDto(T entity);

//    List<RESPONSE_DTO> toDtos(List<T> entities);

//    T toEntity(REQUEST_DTO requestDto);

    // MappingTarget to add update on entity
    void toEntity(@MappingTarget T entity, T dto);

}
