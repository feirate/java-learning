package Design_Patterns.CreationalPatterns.builder;

/**
 * Created by feirate on 2016/3/21.
 */
//具体建造工具
public class ConcreteBuilder implements Builder {
    Product product = new Product();
    public void buildPartA() {
        //这里是具体如何构建partA的代码
    };
    public void buildPartB() {
        //这里是具体如何构建partB的代码
    };
    public void buildPartC() {
        //这里是具体如何构建partB的代码
    };
    public Product getResult() {
        //返回最后组装成品结果
        return product;
    };
}