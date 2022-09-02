package DecoratorPattern;

/**
 * 抽象组件
 *  Beverage 是一个抽象类，有两个方法 getDescription 和cost
 *  getDescription 已经在此实现了， cost方法必须在子类中实现
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
