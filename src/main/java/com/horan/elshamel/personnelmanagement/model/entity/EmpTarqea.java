package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_TARQEA")
public class EmpTarqea extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "QRARID", length = 100)
    private String qrarId;

    @Column(name = "DATQRAR", length = 15)
    private String qrarDate;

    @Column(name = "KHETABID", length = 100)
    private String khetabId;

    @Column(name = "DATKHETAB", length = 15)
    private String khetabDate;

    @Column(name = "MOSADAKAID", length = 100)
    private String mosadakaId;

    @Column(name = "DATMOSADAKA", length = 15)
    private String mosadakaDate;

    @Column(name = "MAHDARID", length = 100)
    private String mahdarId;

    @Column(name = "DATMAHDAR", length = 15)
    private String mahdarDate;

    // Old position details
    @Column(name = "OLDJOBID")
    private Long oldJobId;

    @Column(name = "OLDFIA", length = 50)
    private String oldFia;

    @Column(name = "OLDNO")
    private Long oldNo;

    @Column(name = "OLDSALARY", precision = 10, scale = 5)
    private BigDecimal oldSalary;

    @Column(name = "OLDNAQLBADAL", precision = 10, scale = 5)
    private BigDecimal oldNaqlBadal;

    @Column(name = "OLDJOBBADALAT", precision = 10, scale = 5)
    private BigDecimal oldJobBadalat;

    @Column(name = "OLDPARTID")
    private Long oldPartId;

    @Column(name = "OLDSYMBLE", length = 150)
    private String oldSymble;

    // New position details
    @Column(name = "NEWJOBID")
    private Long newJobId;

    @Column(name = "NEWFIA", length = 50)
    private String newFia;

    @Column(name = "NEWNO")
    private Long newNo;

    @Column(name = "NEWSALARY", precision = 10, scale = 5)
    private BigDecimal newSalary;

    @Column(name = "NEWNAQLBADAL", precision = 10, scale = 5)
    private BigDecimal newNaqlBadal;

    @Column(name = "NEWJOBBADALAT", precision = 10, scale = 5)
    private BigDecimal newJobBadalat;

    @Column(name = "NEWPARTID")
    private Long newPartId;

    @Column(name = "NEWSYMBLE", length = 150)
    private String newSymble;

    // Additional fields
    @Column(name = "PERCENT")
    private Long percent;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "DATMOBASHARA", length = 15)
    private String mobasharaDate;

    @Column(name = "MOBASHARADAY", length = 20)
    private String mobasharaDay;

    @Column(name = "M_KHETABID", length = 100)
    private String mKhetabId;

    @Column(name = "M_DATKHETAB", length = 15)
    private String mKhetabDate;

}
