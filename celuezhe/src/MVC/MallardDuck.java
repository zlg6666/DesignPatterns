package MVC;


/**
 * @author: zlg
 * @date: 2022/10/17
 */
public class MallardDuck implements Quackable{
    //每个  Quackable 都有一个被观察者 实例变量
    Observable observable;

    //在构造器中，我们创建一个 Observable 并传入 MallardDuck 对象的引用
    public MallardDuck() {
       observable = new Observable(this);
    }

    //当呱呱叫的时候，需要让观察者知道
    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    // 这是 QuackObservable 的方法 我们在这里只是委托给辅助类  Observable 进行
    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
