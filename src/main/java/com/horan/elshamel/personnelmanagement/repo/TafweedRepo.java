package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.TafweedSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Tafweed;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TafweedRepo extends BaseRepository<Tafweed, Long> {
    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.TafweedSearchDto(" +
            "t.id, e.name, t.startDate, t.endDate, t.subject) " +
            "FROM Tafweed t " +
            "JOIN Employee e ON t.empId = e.id " +
            "WHERE (:empId IS NULL OR t.empId = :empId)")
    List<TafweedSearchDto> searchTafweed(
            @Param("empId") Long empId);

}
