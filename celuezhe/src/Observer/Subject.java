package Observer;

//主题接口  在这个里面注销和删除观察者 当主题状态改变的时候 可以通知观察者
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
