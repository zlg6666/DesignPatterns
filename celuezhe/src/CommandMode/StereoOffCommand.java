package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/9
 */
public class StereoOffCommand implements Command{
    Stereo stereo;
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.SetVolume(11);
    }
}
