package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 *
 * 我们需要一些质量控制来确保鸭子一定是被包装起来的。我们要创建一个工厂。创建装饰过的鸭子。此工厂应该生产不同种类的鸭子的产品家族，
 * 因此我们使用抽象工厂
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
