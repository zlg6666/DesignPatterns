package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 *
 * DuckFactory 继承抽象工厂，每个方法创建一个产品：一种特定类型的 Quackable. 模拟器并不知道实际的产品是什么，只知道实现了 Quackable 接口
 * */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
