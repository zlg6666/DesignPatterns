package StateMode;

/**
 * @author: zlg
 * @date: 2022/10/8
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
