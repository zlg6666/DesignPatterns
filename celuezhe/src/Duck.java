//抽象鸭子类
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

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
