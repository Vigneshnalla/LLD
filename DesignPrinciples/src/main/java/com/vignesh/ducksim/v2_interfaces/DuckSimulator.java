package com.vignesh.ducksim.v2_interfaces;

import com.vignesh.ducksim.v2_interfaces.behaviors.Flyable;
import com.vignesh.ducksim.v2_interfaces.behaviors.Quackable;
import com.vignesh.ducksim.v2_interfaces.types.MallardDuck;
import com.vignesh.ducksim.v2_interfaces.types.RedheadDuck;
import com.vignesh.ducksim.v2_interfaces.types.RubberDuck;

public class DuckSimulator {

    public static void main(String[] args) {

        Duck[] ducks = {
                new MallardDuck(),
                new RedheadDuck(),
                new MallardDuck("Daffy"),
                new RubberDuck("Rubber Duck")
        };

        for (Duck duck : ducks) {
            duck.display();
            duck.swim();

            if (duck instanceof Quackable quackable) {
                quackable.quack();
            }

            if (duck instanceof Flyable flyable) {
                flyable.fly();
            }

            System.out.println();
        }
    }
}
