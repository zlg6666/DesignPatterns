package adapter.TurkeyAdapterDuck;

/**
 * @author: zlg
 * @date: 2022/9/13
 *
 *  加入我们现在缺少 duck 对象 想使用 Turkey 来冒充，
 *  但是接口不一样，不能公然那来使用。
 *  因此我们 要实现接口类型的转换
 */

// 1 .首先需要实现想要转换类型的接口 就是 Duck
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    // 2 需要取得适配器的对象引用，这里我们利用构造器取得这个引用
    public TurkeyAdapter(Turkey turkey) {
        this.turkey =turkey;
    }

    // 2. 需要实现接口中所有的方法，quack（） 在类之间的转化很简单，只要调用 gobble 就可以了
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
