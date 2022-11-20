package StateMode;

/**
 * @author: zlg
 * @date: 2022/10/8
 */
public class SoldOutStates implements State {
    GumballMachine gumballMachine;
    public SoldOutStates(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("卖完了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("卖完了，不退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("卖完了，不能转");
    }

    @Override
    public void dispense() {
        System.out.println("卖完了，不能转");
    }
}
