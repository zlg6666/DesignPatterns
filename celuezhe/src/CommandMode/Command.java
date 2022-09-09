package CommandMode;

/**
 * @author: zlg
 * @date: 2022/9/8
 * 所有的命令对象  实现  相同的  包含一个方法的接口
 */
public interface Command {
    public void execute();

    public void undo();
}
