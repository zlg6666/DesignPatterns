package StrategyPattern;

import StrategyPattern.Duck;
import StrategyPattern.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        //具有Duck 的实例
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
