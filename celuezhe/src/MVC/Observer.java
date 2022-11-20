package MVC;

/**
 * @author: zlg
 * @date: 2022/10/20
 */

// 观察者 Observer接口就只有一个方法update ，他需要传入正在呱呱叫的对象 QuackObservable （被观察者）
public interface Observer {
    public void update(QuackObservable duck);
}
