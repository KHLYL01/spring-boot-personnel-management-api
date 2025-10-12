package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.model.entity.Banks;

import java.util.List;

public interface BanksService {

    List<Banks> findBanks(String id, String name);
    List<Banks> findAll();
    Banks findById(String id);
    Banks save(Banks dto);
    void deleteById(String aLong);
}
