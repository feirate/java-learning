package Design_Patterns.CreationalPatterns.builder;

/**
 * Created by feirate on 2016/3/21.
 */
//���彨�칤��
public class ConcreteBuilder implements Builder {
    Product product = new Product();
    public void buildPartA() {
        //�����Ǿ�����ι���partA�Ĵ���
    };
    public void buildPartB() {
        //�����Ǿ�����ι���partB�Ĵ���
    };
    public void buildPartC() {
        //�����Ǿ�����ι���partB�Ĵ���
    };
    public Product getResult() {
        //���������װ��Ʒ���
        return product;
    };
}