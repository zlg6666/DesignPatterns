/**
 * 策略模式 定义
 *   策略模式定义了算法族，分别封装起来，让他们之间可以相互替代，此模式让算法的变化独立与使用算法的客户
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performQuack();
        /**
         * 这里我们把鸭子的行为委托给 flyBehavior 对象，
         * 该对象实在模型构造器中设置的
         */
        model.performFly();
        /**
         * 这里调用setter方法，把火箭动力的行为设置到模型鸭中，
         * 就可以改变在运行时改变鸭子的行为，只要调用setting方法就OK
         */
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
