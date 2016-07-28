package Design_Patterns.CreationalPatterns.singleton.version1_5;

/**
 * Singleton 的简化版本(懒汉模式)
 * 这种方法非常简单，因为单例的实例被声明成 static 和 final 变量了，在第一次加载类到内存中时就会初始化，所以创建实例本身是线程安全的。
 */
//version 1.5
public class Singleton {
    private volatile static Singleton singleton = new Singleton();
    private Singleton()  {    }
    public static Singleton getInstance()   {
        return singleton;
    }
    /**
     * 但是，这种玩法的最大问题是——当这个类被加载的时候，new Singleton() 这句话就会被执行，就算是getInstance()没有被调用，类也被初始化了。
     */
}
