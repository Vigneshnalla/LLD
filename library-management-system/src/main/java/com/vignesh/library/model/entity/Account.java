package com.vignesh.library.model.entity;

import com.vignesh.library.model.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
    @Id
    @Column(name = "account_id", nullable = false)
    private String id;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private AccountStatus status;

    @OneToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
}
