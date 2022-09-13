package adapter.outwardPattern;

/**
 * @author: zlg
 * @date: 2022/9/13
 */
public class Amplifier {
    public void on() {
        System.out.println("Amplifier音响打开");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier放入DVD");
    }

    public void serSurroundSound() {
        System.out.println("Amplifier开启环绕音");
    }

    public void off() {
        System.out.println("Amplifier 关闭");
    }
}
