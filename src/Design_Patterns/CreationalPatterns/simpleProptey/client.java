package Design_Patterns.CreationalPatterns.simpleProptey;

/**
 * Created by feirate on 2016/3/22.
 */
public class client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;
    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public client(Prototype prototype){
        this.prototype = prototype;
    }
    public void operation(Prototype example){
        //需要创建原型接口的对象
        Prototype copyPrototype = (Prototype)prototype.clone();

    }
}
