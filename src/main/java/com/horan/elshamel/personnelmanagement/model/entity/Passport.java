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
@Table(name = "PASSPORT")
public class Passport extends BaseEntity<Long> {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;


    @Column(name = "NAME", length = 150)
    private String name;

    @Column(name = "NATID", precision = 20)
    private Long nationalId;

    @Column(name = "NO", length = 50)
    private String documentNumber;

    @Column(name = "EXPORTFROM", length = 150)
    private String exportFrom;

    @Column(name = "SHAHED", length = 150)
    private String witness;

    @Column(name = "OWNER", length = 150)
    private String owner;

    @Column(name = "DAT", length = 50)
    private String date;

}
