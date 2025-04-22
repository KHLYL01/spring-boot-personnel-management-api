package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpOvertimeSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpOvertime;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmpOvertimeRepo extends BaseRepository<EmpOvertime, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpOvertimeSearchDto(" +
            "o.id, e.cardId, e.name, j.name, " +
            "o.hoursAvg, o.period, o.datBegin,o.place) " +
            "FROM EmpOvertime o " +
            "JOIN EmpOvertimeDet od ON od.overtimeId = o.id " +
            "JOIN Employee e ON od.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "AND (:place IS NULL OR o.place LIKE %:place%) " +
            "ORDER BY e.name")
    List<EmpOvertimeSearchDto> searchOvertime(
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("place") String place);

}
