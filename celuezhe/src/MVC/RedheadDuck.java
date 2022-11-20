package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 */
public class RedheadDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
