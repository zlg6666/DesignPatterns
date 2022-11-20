package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 */
public class RubberDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
