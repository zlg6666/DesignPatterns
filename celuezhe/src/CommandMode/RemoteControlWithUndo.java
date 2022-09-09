package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/8
 */
public class RemoteControlWithUndo {
    //遥控器（调用者）要处理7个开与关的命令，使用数组来记录
    Command[] onCommands;
    Command[] offCommands;
    //记录遥控器的上一个命令
    Command undoCommand;

    //在构造器中只需实例化并初始化这两个开与关的数组
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        // 开始时没有前一个命令，所以将其设置为noCommand
        undoCommand = noCommand;
    }

    //setOnCommand 方法需要有3个参数，分别是插槽的位置，开的命令、关的命令。这些命令记录在开关数组对应的插槽位置。以便稍后使用
    public void setOnCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ----- Remote Control ---\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " +i + "]" + onCommands[i].getClass().getName() + "  " + onCommands[i].getClass().getName() + "\n" );
        }
        return stringBuffer.toString();
    }
}
