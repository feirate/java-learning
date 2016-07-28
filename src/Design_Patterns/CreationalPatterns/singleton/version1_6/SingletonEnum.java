package Design_Patterns.CreationalPatterns.singleton.version1_6;

import java.lang.reflect.Constructor;

/**
 *
 *ö��ʵ�ֵ���
 *<p>Ŀǰ��õķ�ʽ�������˷���Ĺ��������л�������
 *
 *<pre>
 *�������ö��˽�й��캯�����Խ��:
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

        //���ԣ��Ƿ���Է�������ö��
        // ���÷������˽�й�����
        Constructor[] arrayConstructor = SingletonEnum.INSTANCE.getClass().getDeclaredConstructors();
        for (Constructor constructor : arrayConstructor)
        {
            // ����setAccessible(true);
            constructor.setAccessible(true);

            // ʵ����,����һ�����׳��쳣
            constructor.newInstance();
        }
    }

}
