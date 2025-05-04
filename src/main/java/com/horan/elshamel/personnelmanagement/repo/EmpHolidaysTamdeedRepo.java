package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysTamdeed;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpHolidaysTamdeedRepo extends BaseRepository<EmpHolidaysTamdeed, Long> {

    List<EmpHolidaysTamdeed> findAllByHolidaysId(Long holidayId);

//    @Query(value = "SELECT NVL(MAX(e.id), 0) + 1 FROM EmpHolidaysTamdeed e")
//    Long getNextId();
}
