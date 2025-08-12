package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.PassportSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Passport;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassportRepo extends BaseRepository<Passport, Long> {


    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.PassportSearchDto(" +
            "p.id, p.date, p.name, " +
            "n.name, p.documentNumber, p.exportFrom) " +
            "FROM Passport p " +
            "JOIN EmpNations n ON p.nationalId = n.id " +
            "WHERE (:name IS NULL OR p.name LIKE %:name%) " +
            "AND (:passportNumber IS NULL OR p.documentNumber = :passportNumber)")
    List<PassportSearchDto> searchPassport(
            @Param("name") String name,
            @Param("passportNumber") String passportNumber);
}
