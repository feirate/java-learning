package Design_Patterns.StructuralPatterns.Adapter.wrapper2;

/**
 * Created by feirate on 2016/4/22.
 * �ӿڵ�������ģʽ������ϣ��ʵ��һ���ӿ������еķ���ʱ�����Դ���һ��������Wrapper��ʵ�����з���������д������ʱ�򣬼̳г����༴�ɡ�
 */
public class Wrapper2Test {
    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
