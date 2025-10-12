package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysTamdeedFilterDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysTamdeed;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmpHolidaysTamdeedRepo extends BaseRepository<EmpHolidaysTamdeed, Long> {

    List<EmpHolidaysTamdeed> findAllByHolidaysId(Long holidayId);


    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysTamdeedFilterDto(" +
//            "COALESCE(SUM(ht.tamdeedPeriod),0), COALESCE(MAX(ht.id),0) ,MAX(ht.tamdeedEnd)) " +
           "CAST(COALESCE(SUM(ht.tamdeedPeriod),0) AS LONG), MAX(ht.tamdeedEnd)) " +

           "FROM EmpHolidaysTamdeed ht " +
           "INNER JOIN EmpHolidays h ON ht.holidaysId = h.id " +
           "WHERE (:holidayId IS NULL OR h.id = :holidayId) " +
           "AND ht.holidayType IN (:holidaysType)" +
           "AND ((:fromDate IS NULL OR h.startDate >= :fromDate) AND (:toDate IS NULL OR h.startDate <= :toDate))")
    List<EmpHolidaysTamdeedFilterDto> countPeriod(@Param("holidayId") Long holidayId,
                                                  @Param("holidaysType") List<Integer> holidaysType,
                                                  @Param("fromDate") Date fromDate,
                                                  @Param("toDate") Date toDate);

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysTamdeedFilterDto(" +
//            "COALESCE(SUM(ht.tamdeedPeriod),0), COALESCE(MAX(ht.id),0) ,MAX(ht.tamdeedEnd)) " +
           "CAST(COALESCE(SUM(ht.tamdeedPeriod),0) AS LONG), MAX(ht.tamdeedEnd)) " +

           "FROM EmpHolidaysTamdeed ht " +
           "INNER JOIN EmpHolidays h ON ht.holidaysId = h.id " +
           "WHERE (:holidayId IS NULL OR h.id = :holidayId) ")
    List<EmpHolidaysTamdeedFilterDto> countPeriodWithoutHolidayType(@Param("holidayId") Long holidayId);

//    @Query(value = "SELECT NVL(MAX(e.id), 0) + 1 FROM EmpHolidaysTamdeed e")
//    Long getNextId();
}
