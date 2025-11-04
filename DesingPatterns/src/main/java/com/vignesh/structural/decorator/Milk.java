package com.vignesh.structural.decorator;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
