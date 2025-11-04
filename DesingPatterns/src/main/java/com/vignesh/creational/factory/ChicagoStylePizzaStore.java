package com.vignesh.creational.factory;

public class ChicagoStylePizzaStore extends PizzaStore {

    protected Pizza createPizza (String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;

    }



}
