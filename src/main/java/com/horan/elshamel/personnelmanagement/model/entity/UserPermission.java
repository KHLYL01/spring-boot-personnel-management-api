package com.horan.elshamel.personnelmanagement.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.horan.elshamel.personnelmanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS_PERMISSION")
public class UserPermission{

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_permission_seq_gen"
    )
    @SequenceGenerator(
            name = "user_permission_seq_gen",
            sequenceName = "USER_PERMISSION_SEQ", // هذا هو اسم الـ SEQUENCE الفعلي في قاعدة بيانات أوراكل
            allocationSize = 1 // يجب أن يتطابق هذا الرقم مع INCREMENT BY في الـ SEQUENCE
    )
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private String permission;

    private boolean save;

    private boolean edit;

    private boolean del;

}
