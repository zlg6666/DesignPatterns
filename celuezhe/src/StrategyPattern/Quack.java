package StrategyPattern;

/**
 * 呱呱叫具体的行为类
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
