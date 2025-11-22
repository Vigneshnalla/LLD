package com.vignesh.library.model.enums;

public enum LendingStatus {
    BORROWED,      // Book is currently borrowed/checked out
    RETURNED,      // Book has been returned successfully
    OVERDUE,       // Book is past due date but not returned
    LOST,          // Book has been reported as lost
    RESERVED,      // Book is reserved for a member
    CANCELLED,     // Lending was cancelled
    EXTENDED       // Due date has been extended
}