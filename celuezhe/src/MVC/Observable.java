package MVC;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: zlg
 * @date: 2022/10/19
 */

//被观察者  Observable 实现了  QuackObservable（被观察者接口的所有方法），我们只要把Observable插入一个类，就可以让那个改类将工作委托给
    //Observable 必须实现  QuackObservable ，因为他们具有一组相同的方法，  QuackObservable会将这些方法的调用转给  Observable的方法
public class Observable implements QuackObservable{
    //观察者
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }



    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
