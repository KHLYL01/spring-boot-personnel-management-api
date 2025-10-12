package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.model.entity.Banks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BanksRepo extends JpaRepository<Banks, String> {


    @Query("SELECT j FROM Banks j" +
           " WHERE (:id IS NULL OR j.id = :id)" +
           " AND (:name IS NULL OR j.name LIKE %:name%)")
    List<Banks> findBanks(
            @Param("id") String id,
            @Param("name") String name
    );

}
