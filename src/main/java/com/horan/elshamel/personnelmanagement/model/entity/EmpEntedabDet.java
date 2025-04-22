package com.horan.elshamel.personnelmanagement.model.entity;

import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_ENTEDAB_DET")
public class EmpEntedabDet {

    @Id
    @Column(name = "MAXID")
    private Long maxId;

    @Column(name = "ENTEDABID")
    private Long entedabId;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "PREV", precision = 10)
    private Long prev;

    @Column(name = "EXTERNALENTEDAB", precision = 18, scale = 2)
    private BigDecimal externalEntedab;

}
