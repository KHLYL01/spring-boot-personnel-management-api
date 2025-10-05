package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidays;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
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


// (h.cancel = 0 OR h.cancel IS NULL) " +
//           "AND

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysReportDto(" +
           "h.id, e.name, j.name, h.startDate,e.fia, e.draga, " +
           "h.holidayType,h.period,h.extensionPeriod,h.extensionStartDate,h.extensionEndDate, " +
           "h.startDateString, h.endDateString ) " +
           "FROM Employee e " +
           "INNER JOIN EmpHolidays h ON e.id = h.empId " +
           "INNER JOIN EmpJobs j ON e.jobId = j.id " +
           "WHERE (:empId IS NULL OR e.id = :empId) " +
           "ORDER BY h.id")
    List<EmpHolidaysReportDto> testWithoutDates(@Param("empId") Long empId);


    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysReportDto(" +
           "h.id, e.name, j.name, h.startDate,e.fia, e.draga, " +
           "h.holidayType,h.period,h.extensionPeriod,h.extensionStartDate,h.extensionEndDate, " +
           "h.startDateString, h.endDateString ) " +
           "FROM Employee e " +
           "INNER JOIN EmpHolidays h ON e.id = h.empId " +
           "INNER JOIN EmpJobs j ON e.jobId = j.id " +
           "WHERE (:all = TRUE OR (h.startDate BETWEEN :fromDate AND :toDate)) " +
           "AND (:empId IS NULL OR e.id = :empId) " +
           "AND (" +
           "(:fromPeriod <= 0 AND :toPeriod <= 0) OR " +
           "(:fromPeriod >= 0 AND :toPeriod > 0 AND h.period BETWEEN :fromPeriod AND :toPeriod) OR " +
           "(:fromPeriod >= 0 AND :toPeriod <= 0 AND h.period = :fromPeriod)) " +
           "AND (:holidayType IS NULL OR h.holidayType = :holidayType) " +
           "ORDER BY h.id")
    List<EmpHolidaysReportDto> reportHolidays(
            @Param("all") boolean all,
            @Param("empId") Long empId,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate,
            @Param("fromPeriod") BigDecimal fromPeriod,
            @Param("toPeriod") BigDecimal toPeriod,
            @Param("holidayType") Integer holidayType
    );

}
