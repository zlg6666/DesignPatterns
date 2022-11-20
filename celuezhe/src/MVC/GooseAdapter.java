package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 */
public class GooseAdapter implements Quackable{
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.Honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
