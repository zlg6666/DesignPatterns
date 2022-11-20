package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 */
public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
