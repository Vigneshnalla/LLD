package com.vignesh.ducksim.v2_interfaces.types;

import com.vignesh.ducksim.v2_interfaces.Duck;
import com.vignesh.ducksim.v2_interfaces.behaviors.Flyable;
import com.vignesh.ducksim.v2_interfaces.behaviors.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {

    // ---- Constructor ----
    public RedheadDuck(String name) {
        // Default color and size for RedheadDuck
        super(name, "Reddish Brown", 1.4);
    }

    public RedheadDuck() {
        // Default name if none provided
        this("Redhead Duck");
    }


    @Override
    public void display() {
        System.out.println("----- Redhead Duck Info -----");
        super.display();
    }

    @Override
    public void quack() {
        System.out.println(getName() + " says: Quack! Quack! 🦆");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is soaring gracefully through the sky 🕊️");
    }

}
