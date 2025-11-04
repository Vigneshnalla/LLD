package com.vignesh.creational.factory;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;

    }
}
