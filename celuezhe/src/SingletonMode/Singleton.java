package SingletonMode;

public class Singleton {
    //这是保证单例模式可行性的最直接的用法
    //如果不考虑性能的话，可以这么使用，
    //因为同步一个方法可能造成性能下降100倍
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
