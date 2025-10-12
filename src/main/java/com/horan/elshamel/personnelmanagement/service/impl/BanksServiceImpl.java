package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.model.entity.Banks;
import com.horan.elshamel.personnelmanagement.repo.BanksRepo;
import com.horan.elshamel.personnelmanagement.service.BanksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BanksServiceImpl implements BanksService {

    private final BanksRepo repo;


    @Override
    public List<Banks> findBanks(String id, String name) {
        return repo.findBanks(id, name);
    }

    @Override
    public List<Banks> findAll() {
        return repo.findAll();
    }

    @Override
    public Banks findById(String id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Bank not found"));
    }

    @Override
    public Banks save(Banks dto) {
        return repo.save(dto);
    }

    @Override
    public void deleteById(String id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
