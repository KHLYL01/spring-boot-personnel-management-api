package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTaeenSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTaeen;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpTaeenRepo extends BaseRepository<EmpTaeen, Long> {
    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpTaeenSearchDto(" +
            "t.id, t.qrarId, t.qrarDate, " +
            "e.name, t.socialNumber, t.mKhetabDate) " +
            "FROM EmpTaeen t " +
            "LEFT JOIN Employee e ON t.empId = e.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%)")
    List<EmpTaeenSearchDto> searchTaeen(@Param("name") String name);
}
