package Design_Patterns.CreationalPatterns.singleton.version1_1;

// version 1.1
public class Singleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    // private static Singleton instance = null;
    /** version 1.4
     * instance = new Singleton()这句，这并非是一个原子操作,我们需要把singleton声明成 volatile 就可以了
     * 使用 volatile 有两个功用：
     * 1）这个变量不会在多个线程中存在复本，直接从内存读取。
     * 2）这个关键字会禁止指令重排序优化。也就是说，在 volatile 变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），读操作不会被重排序到内存屏障之前。
     */
    private volatile static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 静态工程方法，创建实例 */
    public static Singleton getInstance() {
        /** version 1.3 (双重检查锁定)
         * 如果实例已创建不进行synchronized操作,避免不必要的线程同步，提高性能
         */
        if(instance == null) {
            /** version 1.2
             * synchronized方法会帮助我们同步所有的线程，让我们并行线程变成串行的一个一个去new
             * 只有实例未创建时才会被创建
             */
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
