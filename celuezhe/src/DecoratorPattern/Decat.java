package DecoratorPattern;

/**
 *具体组件
 * 1。 Decat 继承 Beverage  因为它是一种饮料
 */
public class Decat extends Beverage{

    //为了描述饮料，我们写了一个构造器，  description 实例变量 继承自 beverage
    public Decat() {
        description = "Decat";
    }

    // 需要计算Decat的价格，我们现在先不用管 调料的价格  直接吧 Decat的价格 返回
    @Override
    public double cost() {
        return 2.99;
    }
}
