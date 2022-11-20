package MVC;

/**
 * @author: zlg
 * @date: 2022/10/17
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redheadDuck = new RedheadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//        System.out.println("\n Duck Simulator");

        //装饰者模式创建不同种类的鸭子
//        Quackable mallardDuck = new QuackCounter(new MallardDuck());
//        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
//        Quackable duckCall = new QuackCounter(new DuckCall());
//        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        //工厂模式创建鸭子，不在直接实例化鸭子
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\n Duck Simulator: with Decorator");

        //先创建一个flock ，然后吧许多 Quackable 塞给它， 这个 flock 是 主群
        Flock flockOfDuck = new Flock();

        flockOfDuck.add(mallardDuck);
        flockOfDuck.add(redheadDuck);
        flockOfDuck.add(rubberDuck);
        flockOfDuck.add(duckCall);

        Flock flockOfMallards = new Flock();
        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();

        //将他们加入到绿头鸭群
        flockOfMallards.add(mallardDuckOne);
        flockOfMallards.add(mallardDuckTwo);
        flockOfMallards.add(mallardDuckThree);
        flockOfMallards.add(mallardDuckFour);

        //在将绿头鸭群加入到主群中
        flockOfDuck.add(flockOfMallards);

        System.out.println("\n 主群" );

        Observer quackologist = new Quackologist();
        flockOfDuck.registerObserver(quackologist);
        simulate(flockOfDuck);


        System.out.println("\n 绿头鸭群" );
        simulate(flockOfMallards);

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
        System.out.println("\n 叫了" + QuackCounter.getQuacks() + "次");
    }

    //我们在这里重载了 simulate 来模拟一直鸭子
    void simulate(Quackable duck) {
        duck.quack();
    }
}
