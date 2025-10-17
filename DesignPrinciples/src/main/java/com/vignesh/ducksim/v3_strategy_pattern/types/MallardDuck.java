package com.vignesh.ducksim.v3_strategy_pattern.types;


import com.vignesh.ducksim.v3_strategy_pattern.Duck;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.FlyWithWings;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.Quack;

public class MallardDuck extends Duck {

    // ---- Constructor ----
    public MallardDuck(String name) {
        // Set default color and size for MallardDuck
        super(name, "Green and Brown", 1.5);
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public MallardDuck() {
        // Default name if none provided
        this("Mallard Duck");
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
