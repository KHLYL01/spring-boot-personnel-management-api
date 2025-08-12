package com.horan.elshamel.personnelmanagement.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_seq_gen"
    )
    @SequenceGenerator(
            name = "user_seq_gen",
            sequenceName = "USER_SEQ", // هذا هو اسم الـ SEQUENCE الفعلي في قاعدة بيانات أوراكل
            allocationSize = 1 // يجب أن يتطابق هذا الرقم مع INCREMENT BY في الـ SEQUENCE
    )
    private Long id;

    private String username;

    private String password;

    private String empName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserPermission> userPermissions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserSignature> userSignatures;

}
