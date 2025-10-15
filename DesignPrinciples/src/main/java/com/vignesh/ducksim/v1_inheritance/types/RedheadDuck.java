package com.vignesh.ducksim.v1_inheritance.types;

import com.vignesh.ducksim.v1_inheritance.Duck;

public class RedheadDuck extends Duck {

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
}
