package MVC.RealMVC.control;

/**
 * @author: zlg
 * @date: 2022/10/21
 */
public interface ControlInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
