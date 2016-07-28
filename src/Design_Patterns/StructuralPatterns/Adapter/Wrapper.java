package Design_Patterns.StructuralPatterns.Adapter;

/**
 * Created by feirate on 2016/4/22.
 * �����������ģʽ����ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��Wrapper�࣬����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ������С�
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
