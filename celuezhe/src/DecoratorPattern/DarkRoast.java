package DecoratorPattern;

/**
 *具体组件
 * 1。 DarkRoast 继承 Beverage  因为它是一种饮料
 */
public class DarkRoast extends Beverage{

    //为了描述饮料，我们写了一个构造器，  description 实例变量 继承自 beverage
    public DarkRoast() {
        description = "DarkRoast";
    }

    // 需要计算DarkRoast的价格，我们现在先不用管 调料的价格  直接吧 DarkRoast的价格 返回
    @Override
    public double cost() {
        return 2.99;
    }
}
