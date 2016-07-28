package Design_Patterns.CreationalPatterns.singleton.version1_6;

/**
 * Singleton �ļ򻯰汾������ģʽ��
 * ʹ��JVM������Ʊ�֤���̰߳�ȫ���⣻���� SingletonHolder ��˽�еģ����� getInstance() ֮��û�а취�������������ֻ����getInstance()������ʱ�Ż�����������
 * ͬʱ��ȡʵ����ʱ�򲻻����ͬ����û������ȱ�ݣ�Ҳ������ JDK �汾��
 */

// version 1.6
public class Singleton {
    /* �˴�ʹ��һ���ڲ�����ά������ */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    /* ˽�й��췽������ֹ��ʵ���� */
    private Singleton (){}
    /* ��ȡʵ�� */
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
    public Object readResolve() {
        return getInstance();
    }
}
