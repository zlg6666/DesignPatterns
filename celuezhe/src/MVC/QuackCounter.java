package MVC;

import java.util.Observer;

/**
 * @author: zlg
 * @date: 2022/10/17
 *
 * 我们想知道呱呱叫的次数，怎么办？
 * 创建一个装饰者，通过吧鸭子包装进装饰者对象，给鸭子一些新行为（计算次数的行为），不需要修改鸭子的代码
 */

public class QuackCounter implements Quackable{
    Quackable duck;
    static  int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }


    @Override
    public void registerObserver(MVC.Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();

    }
}
