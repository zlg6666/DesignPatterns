package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/8
 */
public class GarageDoorOpenCommand implements Command{

    GarageDoor garageDoor;

    public  GarageDoorOpenCommand(GarageDoor garageDoor) {
       this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.off();
    }
}
