package SingletonMode;

/**
 * 经典的双重检查加锁的单例模式
 */
public class Singleton2 {
    //利用双层检查加锁，首先检查是否实例已经创建了，如果没有创建，才进行同步，这样一来，只有第一次才会同步，这才是我们真正想要的
    private volatile static Singleton2 uniqueInstance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton2.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton2();
                }
            }
        }
        return uniqueInstance;
    }
}
