package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_EMPLOYEES")
public class Employee extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", nullable = false)
//    private Long id;

    @Column(name = "DEGREEID")
    private Long degreeId;

    @Column(name = "JOBBADALAT", precision = 10, scale = 5)
    private BigDecimal jobbadalat;

    @Column(name = "JOBID")
    private Long jobId;

    @Column(name = "SYMBLE", length = 150)
    private String symble;

    @Column(name = "PARTID")
    private Long partId;

    @Column(name = "DATJOB", length = 15)
    private String datJob;

    @Column(name = "DATJOBGO")
    private LocalDate datJobGo;

    @Column(name = "NAME", length = 255)
    private String name;

    @Column(name = "NATIONID")
    private Long nationId;

    @Column(name = "CARDID", length = 20)
    private String cardId;

    @Column(name = "BOK", length = 20)
    private String bok;

    @Column(name = "BOKPLACE", length = 255)
    private String bokPlace;

    @Column(name = "DATBOK", length = 15)
    private String datBok;

    @Column(name = "DATBOKGO")
    private LocalDate datBokGo;

    @Column(name = "DATBIRTH", length = 15)
    private String datBirth;

    @Column(name = "DATBIRTHGO")
    private LocalDate datBirthGo;

    @Column(name = "BIRTHPLACE", length = 255)
    private String birthPlace;

    @Column(name = "DATWORK", length = 15)
    private String datWork;

    @Column(name = "DATWORKGO")
    private LocalDate datWorkGo;

    @Column(name = "EDUCATION", length = 255)
    private String education;

    @Column(name = "EDUCATIONNAME", length = 255)
    private String educationName;

    @Column(name = "DATEDUCATION", length = 15)
    private String datEducation;

    @Column(name = "DATEDUCATIONGO")
    private LocalDate datEducationGo;

    @Column(name = "ADDRESS", length = 255)
    private String address;

    @Column(name = "PHONE", length = 20)
    private String phone;

    @Column(name = "WORKJOB", length = 255)
    private String workJob;

    @Column(name = "DISSENT", precision = 10, scale = 5)
    private BigDecimal dissent;

    @Lob
    @Column(name = "PICEMP")
    private byte[] picEmp;

    @Column(name = "EMPTYPE", length = 50)
    private String empType;

    @Column(name = "FIA", length = 50)
    private String fia;

    @Column(name = "DRAGA", precision = 10, scale = 5)
    private BigDecimal draga;

    @Column(name = "SALARY", precision = 10, scale = 5)
    private BigDecimal salary;

    @Column(name = "NAQLBADAL", precision = 10, scale = 5)
    private BigDecimal naqlBadal;

    @Column(name = "TAKENHOLIDAYS")
    private Long takenHolidays;

    @Column(name = "JOBNO")
    private Long jobNo;

    @Column(name = "ELAWA", precision = 10, scale = 5)
    private BigDecimal elawa;

    @Column(name = "INENTEDABBADAL", precision = 10, scale = 5)
    private BigDecimal inEntedabBadal;

    @Column(name = "OUTENTEDABBADAL", precision = 10, scale = 5)
    private BigDecimal outEntedabBadal;

    @Column(name = "JOBSTATE", length = 100)
    private String jobState;

    @Column(name = "AKDNO", length = 100)
    private String akdNo;

    @Column(name = "DATAKDBEGIN", length = 15)
    private String datAkdBegin;

    @Column(name = "DATAKDEND", length = 15)
    private String datAkdEnd;

    @Column(name = "AKDENDSERVICE", length = 200)
    private String akdEndService;

    @Column(name = "AKDNOTASLEEF", length = 200)
    private String akdNoTasleef;

    @Column(name = "SANDOK", precision = 10, scale = 5)
    private BigDecimal sandok;

    @Column(name = "CARD_NO", precision = 10, scale = 0)
    private Long cardNo;

    @Column(name = "CARD_START", length = 15)
    private String cardStart;

    @Lob
    @Column(name = "BARCODE")
    private byte[] barcode;

    @Column(name = "CARDJOB", length = 100)
    private String cardJob;

    @Column(name = "DATQARD", length = 50)
    private String datQard;

    @Column(name = "QARDMONY")
    private Long qardMony;

    @Column(name = "QARDQEST")
    private Long qardQest;

    @Column(name = "COMPUTERNAME", length = 150)
    private String computerName;

    @Column(name = "COMPUTERUSER", length = 150)
    private String computerUser;

    @Column(name = "PROGRAMUSER", length = 150)
    private String programUser;

    @Column(name = "INDATE", length = 150)
    private String inDate;

    @Column(name = "BANKID", length = 10)
    private String bankId;

    @Column(name = "ACCOUNTNO", length = 100)
    private String accountNo;

    @Column(name = "QUICK", precision = 38, scale = 0)
    private BigDecimal quick;

    @Column(name = "SALARY1")
    private Long salary1;

    @Column(name = "MAEESHA", precision = 38, scale = 0)
    private BigDecimal maeesha;

    @Column(name = "DATTAHWEEL", length = 50)
    private String datTahweel;

    @Column(name = "TAKA3OD_M", precision = 38, scale = 2)
    private BigDecimal taka3odM;

    @Column(name = "PREVIOUSE", precision = 38, scale = 0)
    private BigDecimal previous;

    @Column(name = "CARDCOUNT", precision = 38, scale = 0)
    private BigDecimal cardCount;

    @Column(name = "PASSPORTID", length = 50)
    private String passportId;

    @Column(name = "NADAFA", precision = 38, scale = 0)
    private BigDecimal nadafa;

    @Column(name = "ZERAEE", precision = 10, scale = 2)
    private BigDecimal zeraee;

    @Column(name = "DATTYKEED", length = 20)
    private String datTykeed;

    @Column(name = "DATENDGO")
    private LocalDate datEndGo;

    @Column(name = "BADAL1")
    private Long badal1;

    @Column(name = "BADAL2")
    private Long badal2;

    @Column(name = "BADAL3")
    private Long badal3;

    @Column(name = "BADAL4")
    private Long badal4;

    @Column(name = "HASM1")
    private Long hasm1;

    @Column(name = "HASM2")
    private Long hasm2;

    @Column(name = "ISHASM3")
    private Long isHasm3;

    @Column(name = "USERIDM", length = 50)
    private String userIdM;

    @Column(name = "MACHINENUMBER")
    private Long machineNumber;

    @Column(name = "DMOBASHRAG")
    private LocalDate dmobashrag;

    @Column(name = "DMOBASHRAH", length = 20)
    private String dmobashrah;
}