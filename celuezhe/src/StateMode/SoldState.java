package StateMode;

/**
 * @author: zlg
 * @date: 2022/10/8
 */
public class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经投过了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("给过糖果了，不退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("给过糖果了，不能在转了");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("卖完了");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
