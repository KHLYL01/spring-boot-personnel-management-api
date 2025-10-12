package com.horan.elshamel.personnelmanagement.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BANKS")
public class Banks {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

}
