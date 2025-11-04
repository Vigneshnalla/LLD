package com.vignesh.creational.factory;

import java.util.ArrayList;
import java.util.List;


public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<Object> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing "+ name);
        System.out.println("Tossing dough.. ");
        System.out.println("Adding sauce ");
        System.out.println("Adding toppings.. ");
        for (int i = 0; i < toppings.size(); i++) {
           System.out.println(" "+toppings.get(i));
        }
    }
    void bake(){
        System.out.println("Baking pizza for 25 min");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal sizes");
    }
    void box(){
        System.out.println("Place pizza into official pizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<Object> getToppings() {
        return toppings;
    }

    public void setToppings(List<Object> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
