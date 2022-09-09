package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/9
 */
public class CeilingFanOffCommand1 implements Command{
    CeilingFan ceilingFan;
    public CeilingFanOffCommand1(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
