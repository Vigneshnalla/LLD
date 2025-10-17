package com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl;

import com.vignesh.ducksim.v3_strategy_pattern.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("🚫 I can’t fly.");
    }
}
