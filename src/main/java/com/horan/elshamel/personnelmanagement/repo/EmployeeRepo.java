package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeFindDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeSearchDto;
import com.horan.elshamel.personnelmanagement.model.dto.mosaeer.GzaSummaryDto;
import com.horan.elshamel.personnelmanagement.model.dto.mosaeer.HolidayEmployeeDto;
import com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepo extends BaseRepository<Employee, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeSearchDto(" +
           "e.id, e.name, e.cardId,j.id, j.name, p.id, p.name, " +
           "e.fia, e.salary, e.draga, e.jobState, e.workJob) " +
           "FROM Employee e " +
           "JOIN EmpJobs j ON e.jobId = j.id " +
           "JOIN EmpParts p ON e.partId = p.id " +
           "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
           "AND (:id IS NULL OR e.id = :id) " +
           "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
           "AND (:jobId IS NULL OR j.id = :jobId) " +
           "AND (:partId IS NULL OR p.id = :partId) " +
           "AND (:fia IS NULL OR e.fia LIKE %:fia%) " +
           "AND (:draga IS NULL OR e.draga = :draga) " +
           "AND (:jobState IS NULL OR e.jobState = :jobState) " +
           "AND (:empType IS NULL OR e.empType LIKE %:empType%)")
    List<EmployeeSearchDto> searchEmployee(
            @Param("id") Long id,
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("jobId") Long jobId,
            @Param("partId") Long partId,
            @Param("fia") String fia,
            @Param("draga") BigDecimal draga,
            @Param("jobState") String jobState,
            @Param("empType") String empType);


    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeFindDto(" +
           "e.id, e.name, e.fia,e.draga,e.salary, e.naqlBadal, e.inEntedabBadal, e.empType, " +
           "e.badal1, e.badal2,e.badal3,e.badal4, e.jobbadalat, e.maeesha) " +
           "FROM Employee e " +
           "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
           "AND (:id IS NULL OR e.id = :id) " +
           "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
           "AND (:empType IS NULL OR e.empType LIKE %:empType%)")
    List<EmployeeFindDto> findEmployee(
            @Param("id") Long id,
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("empType") String empType);


    /// Mosaeer Salary

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto(" +
           "e.id, e.empType, e.name, e.cardId, j.name, e.fia, e.draga, e.salary, " +
           "0, e.naqlBadal, e.jobbadalat, 0, 0, 0, 0, e.taka3odM , " +
           "0,e.dissent, e.sandok,  e.zeraee , 0, 0, e.akdNoTasleef, " +
           "e.salary, e.naqlBadal, 0, 0, 0, 0, 0, 0, e.maeesha, '', " +
           "e.badal1, e.badal2, e.badal3, e.badal4, e.hasm1, e.hasm2, e.isHasm3, 0) " +
           "FROM Employee e INNER JOIN EmpJobs j ON e.jobId = j.id " +
           "WHERE e.jobState = 'مشغولة' " +
           "ORDER BY e.fia ASC")
    List<MosaeerSalaryDto> getFullReport();

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto(" +
           "e.id, e.empType, e.name, e.cardId, j.name, e.fia, e.draga, e.salary, " +
           "0, e.naqlBadal, e.jobbadalat, 0, 0, 0, 0, e.taka3odM , " +
           "0,e.dissent, e.sandok,  e.zeraee , 0, 0, e.akdNoTasleef, " +
           "e.salary, e.naqlBadal, 0, 0, 0, 0, 0, 0, e.maeesha, '', " +
           "e.badal1, e.badal2, e.badal3, e.badal4, e.hasm1, e.hasm2, e.isHasm3, 0) " +
           "FROM Employee e INNER JOIN EmpJobs j ON e.jobId = j.id " +
           "WHERE e.jobState = 'مشغولة' " +
           "AND (e.empType = :empType) " +
           "ORDER BY e.salary ASC")
    List<MosaeerSalaryDto> getByEmpTypeReport(@Param("empType") String empType);

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto(" +
           "e.id, e.empType, e.name, e.cardId, j.name, e.fia, e.draga, e.salary, " +
           "0, e.naqlBadal, e.jobbadalat, 0, 0, 0, 0, e.taka3odM , " +
           "0,e.dissent, e.sandok,  e.zeraee , 0, 0, e.akdNoTasleef, " +
           "e.salary, e.naqlBadal, 0, 0, 0, 0, 0, 0, e.maeesha, '', " +
           "e.badal1, e.badal2, e.badal3, e.badal4, e.hasm1, e.hasm2, e.isHasm3, 0) " +
           "FROM Employee e INNER JOIN EmpJobs j ON e.jobId = j.id " +
           "WHERE e.jobState = 'مشغولة' " +
           "AND (e.empType = 'مستخدم' OR e.empType = 'موظف') " +
           "ORDER BY e.salary ASC")
    List<MosaeerSalaryDto> getUserAndEmployeeReport();

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto(" +
           "e.id, e.empType, e.name, e.cardId, j.name, e.fia, e.draga, e.salary, " +
           "0, e.naqlBadal, e.jobbadalat, 0, 0, 0, 0, e.taka3odM , " +
           "0,e.dissent, e.sandok,  e.zeraee , 0, 0, e.akdNoTasleef, " +
           "e.salary, e.naqlBadal, 0, 0, 0, 0, 0, 0, e.maeesha, '', " +
           "e.badal1, e.badal2, e.badal3, e.badal4, e.hasm1, e.hasm2, e.isHasm3, 0) " +
           "FROM Employee e INNER JOIN EmpJobs j ON e.jobId = j.id " +
           "WHERE e.jobState = 'مشغولة' " +
           "AND (e.empType = 'مستخدم' OR e.empType = 'موظف' OR e.empType = 'عامل بند إجور') " +
           "ORDER BY e.salary ASC")
    List<MosaeerSalaryDto> getUserAndEmployeeAndWorkerBandOjorReport();

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto(" +
           "e.id, e.empType, e.name, e.cardId, j.name, e.fia, e.draga, e.salary, " +
           "0, e.naqlBadal, e.jobbadalat, 0, 0, 0, 0, e.taka3odM , " +
           "0,e.dissent, e.sandok,  e.zeraee , 0, 0, e.akdNoTasleef, " +
           "e.salary, e.naqlBadal, 0, 0, 0, 0, 0, 0, e.maeesha, '', " +
           "e.badal1, e.badal2, e.badal3, e.badal4, e.hasm1, e.hasm2, e.isHasm3, 0) " +
           "FROM Employee e INNER JOIN EmpJobs j ON e.jobId = j.id " +
           "WHERE e.jobState = 'مشغولة' " +
           "AND (e.empType = 'عامل بند إجور' OR e.empType = 'عامل بند إجور غير سعودى') " +
           "ORDER BY e.salary ASC")
    List<MosaeerSalaryDto> getWorkerBandOjorOrNonSaudiReport();

    @Query("SELECT new com.horan.elshamel.personnelmanagement.model.dto.mosaeer.HolidayEmployeeDto(h.id, h.qrarId) " +
           "FROM EmpHolidays h " +
           "WHERE h.empId = :empId " +
           "AND h.startDate >= :startDate " +
           "AND h.endDate <= :endDate")
    List<HolidayEmployeeDto> findHolidaysByEmpIdAndDateRange(
            @Param("empId") Long empId,
            @Param("startDate") Date startDate,
            @Param("endDate") Date endDate);

    @Query("SELECT new com.horan.elshamel.personnelmanagement.model.dto.mosaeer.GzaSummaryDto( " +
           "SUM(d.ghyab), " +
           "SUM(d.tagmee3), " +
           "SUM(d.mosta7qTotal), " +
           "SUM(d.gza) ) " +
           "FROM EmpHasmDet d " +
           "INNER JOIN EmpHasmiat h ON d.hasmId = h.id " +
           "WHERE d.empId = :empId " +
           "AND h.datQrarGo >= :fromDate " +
           "AND h.datQrarGo <= :toDate")
    GzaSummaryDto getGzaSummaryForEmployeeAndDateRange(
            @Param("empId") Long empId,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate
    );

    @Query("SELECT SUM(d.gza)" +
           "FROM EmpMokhalfatDet d " +
           "INNER JOIN EmpMokhalfat m ON d.mokhalfaId = m.id " +
           "WHERE m.mokhalfaType = 'حسم جزاء' " +
           "AND d.empId = :empId " +
           "AND m.startDate >= :fromDate " +
           "AND m.endDate <= :toDate")
    BigDecimal getMokhafaGzaTotalByEmpAndDateRange(
            @Param("empId") Long empId,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate
    );



}
