package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidays;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpHolidaysRepo extends BaseRepository<EmpHolidays, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysSearchDto(" +
            "h.id, h.startDate, e.cardId, e.name, j.name, " +
            "h.holidayType, h.startDateString, h.endDateString, " +
            "h.period, e.empType, h.etemad) " +
            "FROM EmpHolidays h " +
            "JOIN Employee e ON h.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:empId IS NULL OR h.empId = :empId) " +
            "AND (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "AND (:empType IS NULL OR e.empType LIKE %:empType%) " +
            "AND (:holidayType IS NULL OR h.holidayType = :holidayType) " +
            "ORDER BY e.name")
    List<EmpHolidaysSearchDto> searchHolidays(
            @Param("empId") Long empId,
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("empType") String empType,
            @Param("holidayType") Integer holidayType);

}
