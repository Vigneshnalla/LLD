package com.vignesh.ducksim.v2_interfaces.types;

import com.vignesh.ducksim.v2_interfaces.Duck;
import com.vignesh.ducksim.v2_interfaces.behaviors.Quackable;

public class RubberDuck extends Duck implements Quackable {

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
}
