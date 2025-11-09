package com.vignesh.library.model.entity;


import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Address {

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
