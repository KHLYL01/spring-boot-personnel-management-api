package com.horan.elshamel.personnelmanagement.service;

import com.horan.elshamel.personnelmanagement.model.entity.Actions;

import java.time.LocalDate;
import java.util.List;

public interface ActionsService {

    List<Actions> search(Long id, String username, String type, String action,
                         boolean all, LocalDate fromDate, LocalDate toDate);

    Actions save(Actions dto);
}
