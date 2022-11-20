package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 *  CountingDuckFactory 也继承 抽象工厂，每个方法都会 先使用计数装饰者 将 Quackable 包装起来。
 *  模拟器并不知道有何不同，只知道他实现了 Quackable 接口，但是我们可以放心使用，因为所有的叫声都会被计算进去
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
