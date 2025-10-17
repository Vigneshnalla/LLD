package com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl;

import com.vignesh.ducksim.v3_strategy_pattern.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("🧸 Squeak! Squeak!");
    }
}
