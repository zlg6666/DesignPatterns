package MVC.RealMVC.control;

import MVC.RealMVC.Model.HeartAdapter;
import MVC.RealMVC.Model.HeartModelInterface;
import MVC.RealMVC.View.DJView;

/**
 * @author: zlg
 * @date: 2022/10/21
 */
public class HeartController implements ControlInterface{
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}
