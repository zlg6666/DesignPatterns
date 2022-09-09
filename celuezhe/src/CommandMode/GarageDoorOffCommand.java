package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/8
 */
public class GarageDoorOffCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
       this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.off();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
