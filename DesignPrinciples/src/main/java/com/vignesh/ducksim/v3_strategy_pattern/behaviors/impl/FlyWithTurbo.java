package com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl;

import com.vignesh.ducksim.v3_strategy_pattern.behaviors.FlyBehavior;

public class FlyWithTurbo implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with 2x turbo speed! 🚀💨");
    }
}
