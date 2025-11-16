package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysCutFilterDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysCut;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmpHolidaysCutRepo extends BaseRepository<EmpHolidaysCut, Long> {

    List<EmpHolidaysCut> findAllByHolidaysId(Long holidayId);


    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysCutFilterDto(" +
//            "COALESCE(SUM(ht.tamdeedPeriod),0), COALESCE(MAX(ht.id),0) ,MAX(ht.tamdeedEnd)) " +
           "CAST(COALESCE(SUM(ht.oldPeriod - ht.newPeriod),0) AS LONG)) " +

           "FROM EmpHolidaysCut ht " +
           "INNER JOIN EmpHolidays h ON ht.holidaysId = h.id " +
           "WHERE (:holidayId IS NULL OR h.id = :holidayId) " +
           "AND ht.holidayType IN (:holidaysType)" +
           "AND ((:fromDate IS NULL OR h.startDate >= :fromDate) AND (:toDate IS NULL OR h.startDate <= :toDate))")
    List<EmpHolidaysCutFilterDto> countPeriod(@Param("holidayId") Long holidayId,
                                                  @Param("holidaysType") List<Integer> holidaysType,
                                                  @Param("fromDate") Date fromDate,
                                                  @Param("toDate") Date toDate);

}
