package com.vignesh.library.entity;

import com.vignesh.library.model.Person;
import com.vignesh.library.model.enums.AccountStatus;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public abstract boolean resetPassword();
}
