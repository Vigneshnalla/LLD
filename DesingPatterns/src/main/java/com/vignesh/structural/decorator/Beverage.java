package com.vignesh.structural.decorator;

public abstract class Beverage {
    String description  = "Unknown Beverage";

    String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
