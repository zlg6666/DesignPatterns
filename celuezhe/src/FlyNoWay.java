/**
 * 这是飞行行为的实现，给不会飞的鸭子使用
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm can't fly");
    }
}
