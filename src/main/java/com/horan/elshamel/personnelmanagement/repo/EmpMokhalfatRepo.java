package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpMokhalfatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMokhalfatRepo extends BaseRepository<EmpMokhalfat, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpMokhalfatSearchDto(" +
            "m.id, e.cardId, e.name, j.name, " +
            "m.startDateString, m.endDateString, m.mokhalfaType) " +
            "FROM EmpMokhalfat m " +
            "JOIN EmpMokhalfatDet md ON md.mokhalfaId = m.id " +
            "JOIN Employee e ON md.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "ORDER BY e.name")
    List<EmpMokhalfatSearchDto> searchMokhalfat(
            @Param("name") String name,
            @Param("cardId") String cardId);

}
