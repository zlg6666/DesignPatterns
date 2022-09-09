package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/8
 *
 * 命令模式
 *   命令模式将"请求"封装成对象，以便不同的请求、队列或者日志来参数化其他对象。命令模式也支持撤销的操作。
 */

//RemoteControlTest 这个是命令模式的客户
public class RemoteControlTest {
    public static void main(String[] args) {
        //遥控器就是调用者，会传入一个命令对象，可以用来发出请求
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        //电灯对象，这个对象就是请求的接受者
        Light light = new Light("");
        //这个就是命令对象，将接受者传递给它，表示这个命令对象到底由哪个接受者执行
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        //将命令传递给调用者
        simpleRemoteControl.setCommand(lightOnCommand);
        //调用者执行命令
        simpleRemoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonGarageDoorOpen();
    }
}
