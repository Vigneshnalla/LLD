package com.vignesh.structural.bridge;

public class Car extends Vehicle {
    public Car(Transmission transmission) {
        super(transmission);
    }

    void applyTransmission() {
        transmission.applyGear();
    }
}
