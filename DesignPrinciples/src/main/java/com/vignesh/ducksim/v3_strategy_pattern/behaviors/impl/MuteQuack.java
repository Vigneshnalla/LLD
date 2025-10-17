package com.vignesh.ducksim.v3_strategy_pattern.behaviors.impl;

import com.vignesh.ducksim.v3_strategy_pattern.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("🤫 (Silence...)");
    }
}
