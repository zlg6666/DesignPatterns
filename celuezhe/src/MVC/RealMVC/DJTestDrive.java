package MVC.RealMVC;

import MVC.RealMVC.Model.BeatModel;
import MVC.RealMVC.Model.BeatModelInterface;
import MVC.RealMVC.control.BeatController;

/**
 * @author: zlg
 * @date: 2022/10/21
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface beatModel = new BeatModel();
        BeatController beatController = new BeatController(beatModel);
    }
}
