package Design_Patterns.CreationalPatterns.singleton.version1_5;

/**
 * Singleton �ļ򻯰汾(����ģʽ)
 * ���ַ����ǳ��򵥣���Ϊ������ʵ���������� static �� final �����ˣ��ڵ�һ�μ����ൽ�ڴ���ʱ�ͻ��ʼ�������Դ���ʵ���������̰߳�ȫ�ġ�
 */
//version 1.5
public class Singleton {
    private volatile static Singleton singleton = new Singleton();
    private Singleton()  {    }
    public static Singleton getInstance()   {
        return singleton;
    }
    /**
     * ���ǣ������淨����������ǡ���������౻���ص�ʱ��new Singleton() ��仰�ͻᱻִ�У�������getInstance()û�б����ã���Ҳ����ʼ���ˡ�
     */
}
