package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/8
 */

//遥控器就是调用者，会传入一个命令对象，可以用来发出请求
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }

    public void buttonGarageDoorOpen() {
        slot.execute();
    }
}
