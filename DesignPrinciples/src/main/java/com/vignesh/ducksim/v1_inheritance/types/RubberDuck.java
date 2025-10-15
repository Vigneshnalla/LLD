package com.vignesh.ducksim.v1_inheritance.types;

import com.vignesh.ducksim.v1_inheritance.Duck;

public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name, "Yellow", 0.3);
    }

    public RubberDuck() {
        this("Rubber Duck");
    }

    // ---- Override quack and swim as before ----
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

    // ---- TEMP FIX: Override fly() to prevent inappropriate behavior ----
    @Override
    public void fly() {
        System.out.println(getName() + " cannot fly 🧸 (temporary fix)");
    }
}
