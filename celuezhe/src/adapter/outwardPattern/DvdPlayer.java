package adapter.outwardPattern;

/**
 * @author: zlg
 * @date: 2022/9/13
 */
public class DvdPlayer {
    public void on() {
        System.out.println("DVD打开");
    }

    public void paly(String movie) {
        System.out.println("DVD开始播放");
    }

    public void stop() {
        System.out.println("DVD停止");
    }

    public void eject() {
        System.out.println("DVD退出");
    }

    public void off() {
        System.out.println("DVD关闭");
    }
}
