package StateMode;

/**
 * @author: zlg
 * @date: 2022/10/8
 */
public class GumballMachine {

    //四种状态：糖果售完、 没有25分钱 、 有25分钱 、 售卖糖果
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    //这个实例变量跟踪当前状态，一开始被设置为糖果售磬
    State state = soldOutState;
    // 追踪糖果的数量
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutStates(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    // 投钱动作
    public void insertQuarter() {
        state.insertQuarter();
    }

    //退钱动作
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    //转动曲柄拿糖果的动作
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("糖果出来了");
        if (count != 0) {
            count = count -1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
