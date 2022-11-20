package MVC;


/**
 * @author: zlg
 * @date: 2022/10/19
 * 被观察的对象
 */

// QuackObservable 是一个接口  任何想被观察的Quackable 对象都必须实现改接口
public interface QuackObservable {
    //注册观察者，任何实现了Observer 的对象都可以监听呱呱叫的行为
    public void registerObserver(Observer observer);
    //通知观察者
    public void notifyObservers();

}
