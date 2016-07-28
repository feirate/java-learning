package Design_Patterns.CreationalPatterns.singleton.version1_6;

import java.lang.reflect.Constructor;

/**
 *
 *枚举实现单例
 *<p>目前最好的方式，避免了反射的攻击和序列化的问题
 *
 *<pre>
 *反射调用枚举私有构造函数测试结果:
 *    Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
 at java.lang.reflect.Constructor.newInstance(Unknown Source)
 at com.book.chap2.singleton.Singleton3.main(Singleton3.java:34)
 *</pre>
 *
 *@author landon
 *@since 1.6.0_35
 *@version 1.0.0 2013-1-9
 *
 */

public enum SingletonEnum {
        INSTANCE;
        public void speak() {
            System.out.println(this + " is speaking! ");
        }
    public static void main(String... args) throws Exception
    {
        SingletonEnum s1 = SingletonEnum.INSTANCE;
        s1.speak();
        SingletonEnum s2 = SingletonEnum.INSTANCE;
        s2.speak();
        SingletonEnum s3 = SingletonEnum.INSTANCE;
        s3.speak();
        System.out.println(s1 == s2);

        //测试，是否可以反射生成枚举
        // 利用反射调用私有构造器
        Constructor[] arrayConstructor = SingletonEnum.INSTANCE.getClass().getDeclaredConstructors();
        for (Constructor constructor : arrayConstructor)
        {
            // 调用setAccessible(true);
            constructor.setAccessible(true);

            // 实例化,这里一定会抛出异常
            constructor.newInstance();
        }
    }

}
