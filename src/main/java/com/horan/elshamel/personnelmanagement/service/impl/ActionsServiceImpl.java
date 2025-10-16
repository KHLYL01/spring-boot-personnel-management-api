package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.model.entity.Actions;
import com.horan.elshamel.personnelmanagement.repo.ActionsRepo;
import com.horan.elshamel.personnelmanagement.service.ActionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActionsServiceImpl implements ActionsService {

    private final ActionsRepo repo;

    @Override
    public List<Actions> search(Long id, String username, String type, String action, boolean all, LocalDate fromDate, LocalDate toDate) {
        return repo.filterActions(id, username, type, action, all, fromDate, toDate);
    }

    @Override
    public Actions save(Actions entity) {
        entity.setId(repo.getNextId());
        entity.setDat(LocalDate.now());
        entity.setTim(LocalTime.now().toString().substring(0, 8));
        return repo.save(entity);
    }
}
