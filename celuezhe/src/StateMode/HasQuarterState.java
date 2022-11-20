package StateMode;

import java.util.Random;

/**
 * @author: zlg
 * @date: 2022/10/8
 */
public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经投过了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("给你退钱");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("转动");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() >1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("不能到走这里来");
    }
}
