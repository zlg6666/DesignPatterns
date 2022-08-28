package Observer;

//主题接口
// 所有的都必须要实现该接口
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
