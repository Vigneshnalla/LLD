package com.vignesh.library.model.entity;


import com.vignesh.library.model.enums.BookFormat;
import com.vignesh.library.model.enums.BookStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "book_items")
public class BookItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "barcode",unique = true, nullable = false)
    private String barcode;

    @Column(name = "is_reference_only")
    private boolean isReferenceOnly = false;


    @Enumerated(EnumType.STRING)
    @Column(name = "book_format")
    private BookFormat bookFormat;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private BookStatus status;


    @Column(name = "purchase_date")
    private LocalDate purchasedDate;

    @Column(name = "purchase_price")
    private Double purchasePrice;

    @Column(name = "shelf_location")
    private String shelfLocation;

    @ManyToOne(fetch = FetchType.LAZY)  // ✅ LAZY fetching
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

}
