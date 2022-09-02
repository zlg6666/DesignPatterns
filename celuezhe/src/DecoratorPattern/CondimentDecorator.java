package DecoratorPattern;

/**
 * 抽象装饰者
 * 调料类
 * 1. 必须让调料 CondimentDecorator 能够取代 Beverage  所以让 CondimentDecorator 继承自 beverage 类
 */
public abstract class CondimentDecorator extends Beverage {
    //所以的调料都必须实现 getDescription 方法
    public abstract String getDescription();
}
