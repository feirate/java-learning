package Design_Patterns.CreationalPatterns.simpleProptey;

/**
 * Created by feirate on 2016/3/22.
 */
public class client {
    /**
     * ������Ҫʹ�õ�ԭ�ͽӿڶ���
     */
    private Prototype prototype;
    /**
     * ���췽����������Ҫʹ�õ�ԭ�ͽӿڶ���
     */
    public client(Prototype prototype){
        this.prototype = prototype;
    }
    public void operation(Prototype example){
        //��Ҫ����ԭ�ͽӿڵĶ���
        Prototype copyPrototype = (Prototype)prototype.clone();

    }
}
