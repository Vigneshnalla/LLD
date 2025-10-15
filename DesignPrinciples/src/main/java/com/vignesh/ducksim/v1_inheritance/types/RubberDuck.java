package com.vignesh.ducksim.v1_inheritance.types;

import com.vignesh.ducksim.v1_inheritance.Duck;

public class RubberDuck extends Duck {

    // ---- Constructor ----
    public RubberDuck(String name) {
        // Default color and size for RubberDuck
        super(name, "Yellow", 0.3);
    }

    public RubberDuck() {
        // Default name if none provided
        this("Rubber Duck");
    }

    // ---- Override behaviors ----
    @Override
    public void quack() {
        System.out.println(getName() + " squeaks: Squeak! Squeak! 🧸");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " floats on water but doesn’t really swim 🚤");
    }

    @Override
    public void display() {
        System.out.println("----- Rubber Duck Info -----");
        super.display();
    }
}
