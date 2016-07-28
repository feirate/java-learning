package Design_Patterns.CreationalPatterns.singleton.version1_6;

/**
 * Singleton 的简化版本（饿汉模式）
 * 使用JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，因此它只有在getInstance()被调用时才会真正创建；
 * 同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。
 */

// version 1.6
public class Singleton {
    /* 此处使用一个内部类来维护单例 */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    /* 私有构造方法，防止被实例化 */
    private Singleton (){}
    /* 获取实例 */
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
