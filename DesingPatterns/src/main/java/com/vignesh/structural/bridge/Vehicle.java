package com.vignesh.structural.bridge;

public abstract class Vehicle {
    protected Transmission transmission;
    public Vehicle(Transmission transmission){
        this.transmission = transmission;
    }
    
    abstract void applyTransmission();

}
