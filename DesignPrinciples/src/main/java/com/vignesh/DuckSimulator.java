package com.vignesh;

import com.vignesh.ducksim.v1_inheritance.Duck;
import com.vignesh.ducksim.v1_inheritance.types.MallardDuck;
import com.vignesh.ducksim.v1_inheritance.types.RedheadDuck;

public class DuckSimulator {

    public static void main(String[] args) {

        // Create Mallard Duck
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();

        System.out.println();

        // Create Redhead Duck
        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();

        System.out.println();

        // Example: Custom named duck
        Duck customDuck = new MallardDuck("Daffy");
        customDuck.display();
        customDuck.quack();
        customDuck.swim();
    }
}
