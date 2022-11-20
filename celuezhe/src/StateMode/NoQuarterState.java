package StateMode;

/**
 * @author: zlg
 * @date: 2022/10/8
 */
public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投了25分钱");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没有给我投钱，我给你退什么钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("没有给钱，不能转动");
    }

    @Override
    public void dispense() {
        System.out.println("没有给钱，不会出糖果的");
    }
}
