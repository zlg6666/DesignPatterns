package StrategyPattern;

import StrategyPattern.FlyBehavior;

/**
 * 这是飞行行为的实现，给真正会飞的鸭子使用
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
