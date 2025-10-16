package com.vignesh.ducksim.v1_inheritance;

import com.vignesh.ducksim.v1_inheritance.types.MallardDuck;
import com.vignesh.ducksim.v1_inheritance.types.RedheadDuck;
import com.vignesh.ducksim.v1_inheritance.types.RubberDuck;

public class DuckSimulator {

    public static void main(String[] args) {

        // Create Mallard Duck
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();
        mallard.fly();

        System.out.println();

        // Create Redhead Duck
        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();
        redhead.fly();

        System.out.println();

        // Example: Custom named duck
        Duck customDuck = new MallardDuck("Daffy");
        customDuck.display();
        customDuck.quack();
        customDuck.swim();
        customDuck.fly();

        System.out.println();

        Duck rubberDuck = new RubberDuck("Rubber Duck");
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        try {
            rubberDuck.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
    }
}
