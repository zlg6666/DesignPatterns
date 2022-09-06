package SingletonMode;

public class Singleton1 {
   //如果应用程序总是创建并使用单例，或者在创建或运行时方法的负担不是很重，右迫切需要创建该单例
    //利用这种做法，我们可以依赖JVM在加载这个类的时候马上创建此唯一的单例，JVM保证了在任何线程
    //访问uniqueInstance静态变量之前，一定要先创建该实例
    private static Singleton1 uniqueInstance = new Singleton1();

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        return uniqueInstance;
    }
}
