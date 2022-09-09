package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/8
 */
public class Light {
    String name;
    public Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println(name + "电灯打开");
    }

    public void off() {
        System.out.println(name + "电灯关闭");
    }
}
