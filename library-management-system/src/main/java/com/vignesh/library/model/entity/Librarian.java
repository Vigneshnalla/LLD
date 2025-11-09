package com.vignesh.library.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "librarians")
@PrimaryKeyJoinColumn(name = "account_id")
public class Librarian extends Account {

    @Column(name = "joining_date")
    private LocalDate joiningDate;

    @Column(name = "employee_id", unique = true)
    private String employeeId; // For organizational identity
}
