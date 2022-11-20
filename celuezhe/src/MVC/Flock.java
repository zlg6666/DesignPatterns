package MVC;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: zlg
 * @date: 2022/10/17
 *
 * 想管理一群鸭子，组合模式允许我们想对待点那个对象一样对待集合对象
 */

//组合模式需要和 叶节点元素一样 实现相同的接口， 这里的叶节点 就是 Quackable
public class Flock implements Quackable{

    //在每一个 Flock 中 我们使用ArrayList标记 属于这个 Flock 的  Quackable 对象
    ArrayList ducks = new ArrayList();

    public void add(Quackable quackable) {
        ducks.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable)iterator.next();
            quackable.quack();
        }

    }


    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }


    @Override
    public void notifyObservers() {

    }
}
