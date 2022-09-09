package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/9
 */
public class StereoOnWithCDCommand implements Command{
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.SetVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
