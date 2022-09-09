package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/9
 */
public class CellingFanMediumCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CellingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    // 在execute() 中，在我们改变风扇的速度之前，需要将之前额状态记录下来，以便需要撤销的时候使用
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    //将风扇的速度设置回之前的值，达到撤销的目的
    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }

}
