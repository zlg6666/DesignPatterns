package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/9
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    String name;
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("风扇高速");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("风扇中速");
    }

    public void low() {
        speed = LOW;
        System.out.println("风扇低速");
    }

    public void off() {
        speed = OFF;
        System.out.println("风扇关闭");
    }

    public int getSpeed() {
        return speed;
    }

    public void on() {
        System.out.println("风扇打开");
    }

}
