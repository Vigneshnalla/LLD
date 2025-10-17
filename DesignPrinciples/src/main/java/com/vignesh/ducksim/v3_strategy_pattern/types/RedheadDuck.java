package com.vignesh.ducksim.v3_strategy_pattern.types;


import com.vignesh.ducksim.v3_strategy_pattern.Duck;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.FlyWithWings;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.Quack;

public class RedheadDuck extends Duck {

    // ---- Constructor ----
    public RedheadDuck(String name) {
        // Default color and size for RedheadDuck
        super(name, "Reddish Brown", 1.4);
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
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
