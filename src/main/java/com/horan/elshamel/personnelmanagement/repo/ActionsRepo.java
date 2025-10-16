package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.entity.Actions;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegrees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ActionsRepo extends BaseRepository<Actions, Long> {


    @Query("SELECT COALESCE(MAX(a.id),0)+1 FROM Actions a")
    Long getNextId();

    @Query("SELECT a FROM Actions a " +
           "WHERE (:id IS NULL OR a.id = :id) " +
           "AND (:username IS NULL OR a.username LIKE %:username%) " +
           "AND (:username IS NULL OR a.action LIKE %:type%) " +
           "AND (:username IS NULL OR a.action LIKE %:action%) " +
           "AND (:all = TRUE OR (a.dat BETWEEN :fromDate AND :toDate)) "
    )
    List<Actions> filterActions(
            @Param("id") Long id,
            @Param("username") String username,
            @Param("type") String type,
            @Param("action") String action,
            @Param("all") boolean all,
            @Param("fromDate") LocalDate fromDate,
            @Param("toDate") LocalDate toDate
    );

}
