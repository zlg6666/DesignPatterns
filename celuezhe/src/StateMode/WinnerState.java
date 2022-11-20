package StateMode;

/**
 * @author: zlg
 * @date: 2022/10/8
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("赢家不用投钱");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("赢家不会退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("赢家不会转动");
    }

    @Override
    public void dispense() {
        System.out.println("赢家，得到两个糖果");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
