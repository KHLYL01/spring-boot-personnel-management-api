package com.horan.elshamel.personnelmanagement.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
@Setter
@Getter
public class BaseEntity<ID extends Number> {

    @Id
    @Column(name = "ID")
    private ID id;

//    @Column(updatable = false)
//    @CreationTimestamp
//    private LocalDateTime createAt;
//
//    @UpdateTimestamp
//    private LocalDateTime updateAt;

}
