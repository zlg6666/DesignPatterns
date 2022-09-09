package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/9
 */
public class RemoteLoader {
    public static void main(String[] args) {
        //遥控器（调用者）
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        //所有的装置 创建在合适的位置 （接受者）
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        //创建所有的电灯 命令对象
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        //创建 所有的 吊扇命令对象
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand1 ceilingFanOffCommand = new CeilingFanOffCommand1(ceilingFan);

        //创建车库的开关命令对象
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);

        //创建 音响的开关
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        //现在有了全部的命令，可以将他们加载到遥控器插槽中
        remoteControl.setOnCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setOnCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setOnCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);
        remoteControl.setOnCommand(3,stereoOnWithCDCommand,stereoOffCommand);

        //打印每个遥控器的插槽和他被指定的命令
        System.out.println(remoteControl);

        //按下开关
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);


        //测试撤销风扇的命令
        CeilingFan livingCeilingFan = new CeilingFan("Living");
        CellingFanMediumCommand cellingFanMediumCommand = new CellingFanMediumCommand(livingCeilingFan);
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(livingCeilingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(livingCeilingFan);
        remoteControl.setOnCommand(4,cellingFanMediumCommand,cellingFanOffCommand);
        remoteControl.setOnCommand(5,cellingFanHighCommand,cellingFanOffCommand);
        //中速开启
        remoteControl.onButtonWasPressed(4);
        //关闭
        remoteControl.offButtonWasPressed(4);
        System.out.println(remoteControl);
        //回到中速
        remoteControl.undoButtonWasPushed();

        //开启高速
        remoteControl.onButtonWasPressed(5);
        System.out.println(remoteControl);
        //回到中速
        remoteControl.undoButtonWasPushed();

        Command[] partyOn = {livingRoomLightOn,kitchenLightOn,ceilingFanOnCommand};
        Command[] partyOff = {livingRoomLightOff,kitchenLightOff,ceilingFanOffCommand};

        MacroCommand macroCommand = new MacroCommand(partyOn);
        MacroCommand macroCommand1 = new MacroCommand(partyOff);
        remoteControl.setOnCommand(6,macroCommand,macroCommand1);
        remoteControl.onButtonWasPressed(6);
        remoteControl.offButtonWasPressed(6);

    }
}
