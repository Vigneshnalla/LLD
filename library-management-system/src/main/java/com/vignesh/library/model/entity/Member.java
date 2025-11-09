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
@Table(name = "members")
@PrimaryKeyJoinColumn(name = "account_id")
public class Member extends Account {

    @Column(name = "membership_start_date", nullable = false)
    private LocalDate membershipStartDate;

    @Column(name = "membership_expiry_date")
    private LocalDate membershipExpiryDate;

    @Column(name = "total_books_checked_out")
    private int totalBooksCheckedOut;

    @Column(name = "membership_id", unique = true, nullable = false)
    private String membershipId;
}
