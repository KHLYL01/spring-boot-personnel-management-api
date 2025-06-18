package com.horan.elshamel.personnelmanagement.model.dto.mosaeer;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MosaeerSalaryDto {

    private Long id;
    private String empType;
    private String name;
    private String cardId;
    private String jobName;
    private String fia;
    private BigDecimal draga;
    private BigDecimal salary;
    private BigDecimal mosta7qSalary;
    private BigDecimal naqlBadal;
    private BigDecimal jobBadalat;
    private BigDecimal ma3esha;
    private int addDays;
    private BigDecimal mosta7qTotal;
    private BigDecimal taka3ed;
    private BigDecimal taka3odM;
    private BigDecimal gza;
    private BigDecimal bank;
    private BigDecimal sandok;
    private BigDecimal zeraee;
    private BigDecimal hasmTotal;
    private BigDecimal safy;
    private String comments;
    private BigDecimal inSalary;
    private BigDecimal inNaqlBadal;
    private BigDecimal inMosta7qSalary;
    private BigDecimal inMosta7qTotal;
    private BigDecimal inSafy;
    private BigDecimal safyNaqlBadal;
    private BigDecimal safyMa3esha;
    private BigDecimal inMa3esha;
    private BigDecimal maeesha;
    private String holidays = "";
    private Long badal1;
    private Long badal2;
    private Long badal3;
    private Long badal4;
    private Long hasm1;
    private Long hasm2;
    private Long isHasm3;
    private BigDecimal hasm3;

    public MosaeerSalaryDto(Long id, String empType, String name, String cardId, String jobName, String fia, BigDecimal draga, BigDecimal salary, int mosta7qSalary, BigDecimal naqlBadal, BigDecimal jobBadalat, int ma3esha, int addDays, int mosta7qTotal, int taka3ed, BigDecimal taka3odM, int gza, BigDecimal bank, BigDecimal sandok, BigDecimal zeraee, int hasmTotal, int safy, String comments, BigDecimal inSalary, BigDecimal inNaqlBadal, int inMosta7qSalary, int inMosta7qTotal, int inSafy, int safyNaqlBadal, int safyMa3esha, int inMa3esha, BigDecimal maeesha, String holidays, Long badal1, Long badal2, Long badal3, Long badal4, Long hasm1, Long hasm2, Long isHasm3, int hasm3) {
        this.id = id;
        this.empType = empType;
        this.name = name;
        this.cardId = cardId;
        this.jobName = jobName;
        this.fia = fia;
        this.draga = draga;
        this.salary = salary;
        this.mosta7qSalary = BigDecimal.ZERO;
        this.naqlBadal = naqlBadal;
        this.jobBadalat = jobBadalat;
        this.ma3esha = BigDecimal.ZERO;
        this.addDays = addDays;
        this.mosta7qTotal = BigDecimal.ZERO;
        this.taka3ed = BigDecimal.ZERO;
        this.taka3odM = taka3odM == null ? BigDecimal.ZERO : taka3odM;
        this.gza = BigDecimal.ZERO;
        this.bank = bank;
        this.sandok = sandok;
        this.zeraee = zeraee == null ? BigDecimal.ZERO : zeraee;
        this.hasmTotal = BigDecimal.ZERO;
        this.safy = BigDecimal.ZERO;
        this.comments = comments;
        this.inSalary = inSalary;
        this.inNaqlBadal = inNaqlBadal;
        this.inMosta7qSalary = BigDecimal.ZERO;
        this.inMosta7qTotal = BigDecimal.ZERO;
        this.inSafy = BigDecimal.ZERO;
        this.safyNaqlBadal = BigDecimal.ZERO;
        this.safyMa3esha = BigDecimal.ZERO;
        this.inMa3esha = BigDecimal.ZERO;
        this.maeesha = maeesha;
        this.holidays = holidays;
        this.badal1 = badal1;
        this.badal2 = badal2;
        this.badal3 = badal3;
        this.badal4 = badal4;
        this.hasm1 = hasm1;
        this.hasm2 = hasm2;
        this.isHasm3 = isHasm3;
        this.hasm3 = BigDecimal.ZERO;
    }
}
