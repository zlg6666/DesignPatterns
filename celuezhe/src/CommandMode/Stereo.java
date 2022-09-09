package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/9
 */
public class Stereo {
    String name;
    public Stereo(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println("音响打开");
    }

    public void setCD() {
        System.out.println("放入CD");
    }

    public void SetVolume(int volume) {
        System.out.println("音响音量打开到11");
    }

    public void off() {
        System.out.println("音响关闭");
    }
}
