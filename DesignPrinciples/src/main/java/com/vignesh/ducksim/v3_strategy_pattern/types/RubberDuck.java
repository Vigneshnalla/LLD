package com.vignesh.ducksim.v3_strategy_pattern.types;

import com.vignesh.ducksim.v3_strategy_pattern.Duck;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.FlyNoWay;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.FlyWithWings;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.Quack;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name, "Yellow", 0.3);
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    public RubberDuck() {
        this("Rubber Duck");
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
