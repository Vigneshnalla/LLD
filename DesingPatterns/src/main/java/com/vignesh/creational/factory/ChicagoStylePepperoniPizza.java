package com.vignesh.creational.factory;

public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Pepperon Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting pizza into square slices");

    }
}
