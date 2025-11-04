package com.vignesh.structural.bridge;

public class ManualTransmission implements Transmission {

    @Override
    public void applyGear() {
        System.out.println("Manual Transmission applied");
    }
    
}
