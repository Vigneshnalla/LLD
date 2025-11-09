package com.vignesh.library.model.enums;

public enum LendingStatus {
    // Active states
    ACTIVE,         // Currently borrowed and within due date
    OVERDUE,        // Past due date but not returned

    // Completion states
    RETURNED,       // Returned successfully and on time
    RETURNED_LATE,  // Returned but after due date

    // Problem states
    LOST,           // Book reported as lost by member
    DAMAGED,        // Book returned in damaged condition

    // Pre-borrow states
    RESERVED,       // Book is on hold for a member
    PICKUP_READY,   // Reserved book is ready for pickup

    // Administrative states
    CANCELLED,      // Reservation or lending cancelled
    EXTENDED        // Due date has been extended
}