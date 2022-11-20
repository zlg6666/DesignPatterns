package MVC.RealMVC.Model;

import MVC.RealMVC.View.BPMObserver;
import MVC.RealMVC.View.BeatObserver;

/**
 * @author: zlg
 * @date: 2022/10/21
 */
public interface HeartModelInterface {
    int getHeatRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
