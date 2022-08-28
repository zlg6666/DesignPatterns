package StrategyPattern;

import StrategyPattern.Duck;
import StrategyPattern.FlyNoWay;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a real duck");
    }
}
