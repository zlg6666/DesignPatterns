package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 *
 * 因为所有的呱呱叫 都要被观察 ，那就直接让 Quackable 接口扩展 Observable
 */
public interface Quackable  extends QuackObservable {
    public void quack();
}
