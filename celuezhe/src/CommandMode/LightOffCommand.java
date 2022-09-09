package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/8
 * 这是一个命令  所以需要实现command接口
 */
public class LightOffCommand implements Command{
    Light light;

    //构造器传入了某个电灯，以便让这个命令控制，然后记录在实例变量中。一旦调用 execute（） 方法，
    // 就由这个电灯对象成为 接受者，负责接受请求
    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
