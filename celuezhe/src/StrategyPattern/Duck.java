package StrategyPattern;

//抽象鸭子类
public abstract class Duck {
    //鸭子飞的行为（接口类型的实例变量）
    FlyBehavior flyBehavior;
    //鸭子叫的行为（接口类型的实例变量）
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    //委托给行为类
    public void performFly() {
        flyBehavior.fly();
    }

    //委托给行为类
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }


    public void swim() {
        System.out.println("all ducks float, event decoys");
    }



    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
