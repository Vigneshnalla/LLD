package com.vignesh.structural.decorator;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

}
