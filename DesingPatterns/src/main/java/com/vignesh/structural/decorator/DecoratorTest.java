package com.vignesh.structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        Beverage beverage1 = new DarkRoast();
        System.out.println(beverage1.getDescription());
        beverage1 = new Milk(new Mocha(beverage1));

        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());
    }
}
