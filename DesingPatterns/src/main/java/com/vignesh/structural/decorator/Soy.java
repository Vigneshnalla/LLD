package com.vignesh.structural.decorator;

public class Soy extends CondimentDecorator{

    public Soy (Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.description + ", Soy ";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
