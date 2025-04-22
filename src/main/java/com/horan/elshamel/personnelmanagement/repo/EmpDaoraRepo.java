package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpDaoraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDaora;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDaoraRepo extends BaseRepository<EmpDaora, Long> {

//    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpDaoraSearchDto(" +
//            "dd.dowraId, e.name, e.fia, e.draga, " +
//            "e.salary, e.naqlBadal, j.name) " +
//            "FROM EmpDowraDet dd " +
//            "JOIN Employee e ON dd.empId = e.id " +
//            "LEFT JOIN Job j ON e.jobId = j.id " +
//            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
//            "AND (:cardId IS NULL OR e.cardId = :cardId)")
//    List<EmpDaoraSearchDto> findFilteredTrainingEmployees(
//            @Param("name") String name,
//            @Param("cardId") String cardId);

}
