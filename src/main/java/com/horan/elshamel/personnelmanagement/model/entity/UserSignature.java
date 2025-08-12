package com.horan.elshamel.personnelmanagement.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserSignature{

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_signature_seq_gen"
    )
    @SequenceGenerator(
            name = "user_signature_seq_gen",
            sequenceName = "USER_SIGNATURE_SEQ", // هذا هو اسم الـ SEQUENCE الفعلي في قاعدة بيانات أوراكل
            allocationSize = 1 // يجب أن يتطابق هذا الرقم مع INCREMENT BY في الـ SEQUENCE
    )
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private String content;

    @Lob
    private byte[] image;

    private String password;

}
