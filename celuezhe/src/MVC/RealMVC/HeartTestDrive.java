package MVC.RealMVC;

import MVC.RealMVC.Model.HeartModel;
import MVC.RealMVC.Model.HeartModelInterface;
import MVC.RealMVC.control.HeartController;

/**
 * @author: zlg
 * @date: 2022/10/21
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModelInterface heartModel = new HeartModel();
        HeartController heartController = new HeartController(heartModel);
    }
}
