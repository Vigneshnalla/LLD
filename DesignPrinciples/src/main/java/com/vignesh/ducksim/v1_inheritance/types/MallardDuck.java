package com.vignesh.ducksim.v1_inheritance.types;

import com.vignesh.ducksim.v1_inheritance.Duck;

public class MallardDuck extends Duck {

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
}
