package MVC;

/**
 * @author: zlg
 * @date: 2022/10/20
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println(duck);
    }
}
