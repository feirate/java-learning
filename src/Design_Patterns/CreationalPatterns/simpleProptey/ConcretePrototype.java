package Design_Patterns.CreationalPatterns.simpleProptey;

/**
 * Created by feirate on 2016/3/22.
 */
public class ConcretePrototype implements Prototype{
    public Prototype clone(){
        //��򵥵Ŀ�¡���½�һ�������������û�����ԾͲ��ٸ���ֵ��
        Prototype prototype = new ConcretePrototype();
        return prototype;
    }
}
