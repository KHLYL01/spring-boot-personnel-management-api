package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpTakleefSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleef;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmpTakleefRepo extends BaseRepository<EmpTakleef, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpTakleefSearchDto(" +
            "t.id, e.cardId, e.name, j.name, " +
            "t.hoursAvg, t.period, t.datBegin,t.place) " +
            "FROM EmpTakleef t " +
            "JOIN EmpTakleefDet td ON td.takleefId = t.id " +
            "JOIN Employee e ON td.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "AND (:place IS NULL OR t.place LIKE %:place%) " +
            "ORDER BY e.name")
    List<EmpTakleefSearchDto> searchOvertime(
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("place") String place);

}
