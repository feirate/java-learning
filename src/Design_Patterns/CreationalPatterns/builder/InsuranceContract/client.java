package Design_Patterns.CreationalPatterns.builder.InsuranceContract;

/**
 * Created by feirate on 2016/3/22.
 */
public class client {
    public static void main(String[]args){
        //��������������
        InsuranceContract.ConcreteBuilder builder =
                new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
        //������Ҫ�����ݣ�Ȼ�󹹽����պ�ͬ����
        InsuranceContract contract =
                builder.setPersonName("С��").setOtherData("test").build();
        //�������պ�ͬ����ķ���
        contract.someOperation();
    }
}
