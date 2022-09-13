package adapter.TurkeyAdapterDuck;

import java.util.Hashtable;

/**
 * @author: zlg
 * @date: 2022/9/13
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();
        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();

        System.out.println("\n Duck Says...");
        testDuck(mallardDuck);

        System.out.println("\n The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
