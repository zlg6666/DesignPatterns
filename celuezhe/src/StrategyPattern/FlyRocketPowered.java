package StrategyPattern;

import StrategyPattern.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fly with a rocket");
    }
}
