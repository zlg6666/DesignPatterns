package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/9
 */
public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingFan;
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
