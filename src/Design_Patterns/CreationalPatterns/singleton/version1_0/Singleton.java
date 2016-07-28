package Design_Patterns.CreationalPatterns.singleton.version1_0;

/**
 * 单例对象（Singleton）是一种常用的设计模式。在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。这样的模式有几个好处：
 * 1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
 * 2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
 * 3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。
 */
// version 1.0
public class Singleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 静态工程方法，创建实例 */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }

    /**
     * 上面的这个程序存在比较严重的问题，因为是全局性的实例，所以，在多线程情况下，所有的全局共享的东西都会变得非常的危险，这个也一样。
     * 在多线程情况下，如果多个线程同时调用getInstance()的话，那么，可能会有多个进程同时通过 (singleton== null)的条件检查，于是，多个实例就创建出来，
     * 并且很可能造成内存泄露问题。我们需要线程互斥或同步，没错，我们需要这个事情
     */
}
