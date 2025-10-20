package com.vignesh.ducksim.v3_strategy_pattern;


import com.vignesh.ducksim.v2_interfaces.behaviors.Flyable;
import com.vignesh.ducksim.v2_interfaces.behaviors.Quackable;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.QuackBehavior;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.FlyNoWay;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl.FlyWithTurbo;
import com.vignesh.ducksim.v3_strategy_pattern.types.MallardDuck;
import com.vignesh.ducksim.v3_strategy_pattern.types.RedheadDuck;
import com.vignesh.ducksim.v3_strategy_pattern.types.RubberDuck;

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
            duck.performFly();

            if(duck.getName().equals("Daffy")){
                duck.setFlyBehavior(new FlyWithTurbo());
                System.out.println("⚙️ Changing fly behavior at runtime...");
                duck.performFly(); // Now flies with turbo!
            }

            duck.performQuack();
            System.out.println();
        }
    }
}
