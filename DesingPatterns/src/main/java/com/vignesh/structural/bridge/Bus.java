package com.vignesh.structural.bridge;

public class Bus extends Vehicle {
     public Bus(Transmission transmission) {
        super(transmission);
    }

    void applyTransmission() {
        transmission.applyGear();
    }
}
