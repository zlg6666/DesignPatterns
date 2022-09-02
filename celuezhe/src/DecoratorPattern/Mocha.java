package DecoratorPattern;

/**
 *  具体装饰者
 *  摩卡是一个装饰者  所以让他扩展 CondimentDecorator 同时 CondimentDecorator 又扩展 Beverage
 */

public class Mocha extends CondimentDecorator{

    /**
     *  要让 摩卡能够引用 一个 beverage 做法如下
     *  1 用一个实例变量 记录饮料 也就是被装饰者
     *  2 想办法让被装饰者（饮料） 被记录 到 实例变量中  具体的做法就是 把饮料 作为构造器 的参数，再由构造器将饮料记录在实例变量中
     *
     */
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 我们希望 不只是描述饮料 （例如 DarkCoast）,而是完整的把 调料都描述出来 （例如 " DarkRoast ， mocha"）
     * 所以 首先利用 委托 的做法 得到一个 叙述  然后在其 后面 加上 附加的 叙述 （例如 " Mocha"）
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    /**
     *  要计算 Mocha 饮料的价格 首先把调用 委托  给 被装饰者对象 计算价格  然后加上mocha 的价钱 得到结果
     * @return
     */
    @Override
    public double cost() {
        return 0.20  +  beverage.cost();
    }


}
