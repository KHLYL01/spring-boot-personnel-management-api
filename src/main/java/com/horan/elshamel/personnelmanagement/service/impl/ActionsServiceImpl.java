package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.entity.Actions;
import com.horan.elshamel.personnelmanagement.repo.ActionsRepo;
import com.horan.elshamel.personnelmanagement.service.ActionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActionsServiceImpl extends BaseServiceImpl<Actions,Long> implements ActionsService {

    private final ActionsRepo repo;

    @Override
    public List<Actions> search(Long id, String username, String type, String action, boolean all, LocalDate fromDate, LocalDate toDate) {
        return repo.filterActions(id, username, type, action, all, fromDate, toDate);
    }

}
