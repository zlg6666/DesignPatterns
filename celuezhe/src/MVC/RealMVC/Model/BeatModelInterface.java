package MVC.RealMVC.Model;

import MVC.RealMVC.View.BPMObserver;
import MVC.RealMVC.View.BeatObserver;

/**
 * @author: zlg
 * @date: 2022/10/21
 */
public interface BeatModelInterface {
    /**
     * 这四个方法是让控制器调用的。控制器根据用户的操作而对模式做适当的处理
     */
    //初始化的方法
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);

    /**
     * 这些方法 允许试图和控制器取得状态，并且变成观察者
     */

    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);

}
