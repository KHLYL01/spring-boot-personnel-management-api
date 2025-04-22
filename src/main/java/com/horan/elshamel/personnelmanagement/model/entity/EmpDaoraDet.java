package com.horan.elshamel.personnelmanagement.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_DAORA_DET")
public class EmpDaoraDet {

    @Id
    @Column(name = "MAXID")
    private Long maxId;

    @Column(name = "ENTEDABID")
    private Long entedabId;

    @Column(name = "EMPID")
    private Long empId;

    @Column(name = "PREV", precision = 10)
    private Integer prev;

    @Column(name = "EXTERNALENTEDAB", precision = 18, scale = 2)
    private BigDecimal externalEntedab;

    @Column(name = "BADEEL", length = 150)
    private String badeel;

    @Column(name = "FINISH", precision = 38)
    private Long finish;

    @Column(name = "REASON", length = 300)
    private String reason;

}
