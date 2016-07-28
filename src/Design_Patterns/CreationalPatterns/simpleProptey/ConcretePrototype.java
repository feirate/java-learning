package Design_Patterns.CreationalPatterns.simpleProptey;

/**
 * Created by feirate on 2016/3/22.
 */
public class ConcretePrototype implements Prototype{
    public Prototype clone(){
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype();
        return prototype;
    }
}
