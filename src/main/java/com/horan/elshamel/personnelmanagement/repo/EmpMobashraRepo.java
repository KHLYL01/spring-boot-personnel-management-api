package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpMobashraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMobashra;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMobashraRepo extends BaseRepository<EmpMobashra, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpMobashraSearchDto(" +
            "m.id, e.name, j.name, e.cardId, " +
            "e.fia, e.draga, e.salary, e.naqlBadal) " +
            "FROM EmpMobashra m " +
            "JOIN Employee e ON m.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "AND (:empType IS NULL OR e.empType LIKE %:empType%)")
    List<EmpMobashraSearchDto> searchMobashra(
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("empType") String empType);

}
