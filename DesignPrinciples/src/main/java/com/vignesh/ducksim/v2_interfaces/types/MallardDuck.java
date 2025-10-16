package com.vignesh.ducksim.v2_interfaces.types;

import com.vignesh.ducksim.v2_interfaces.Duck;
import com.vignesh.ducksim.v2_interfaces.behaviors.Flyable;
import com.vignesh.ducksim.v2_interfaces.behaviors.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {

    // ---- Constructor ----
    public MallardDuck(String name) {
        // Set default color and size for MallardDuck
        super(name, "Green and Brown", 1.5);
    }

    public MallardDuck() {
        // Default name if none provided
        this("Mallard Duck");
    }

    // ---- Optional: Override behaviors ----
    @Override
    public void quack() {
        System.out.println(getName() + " says: Quack! Quack! 🦆");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming fluidly in the pond 🏞️");
    }

    @Override
    public void display() {
        System.out.println("----- Mallard Duck Info -----");
        super.display();
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is soaring gracefully through the sky 🕊️");
    }
}
