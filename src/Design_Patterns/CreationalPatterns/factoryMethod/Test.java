package Design_Patterns.CreationalPatterns.factoryMethod;

/**
 * Created by feirate on 2016/3/20.
 */
public class Test {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sms = factory.produce("sms");
        Sender mail = factory.produce("mail");
        Sender other = factory.produce("other");
        try {
            sms.Send();
            mail.Send();
            other.Send();
        }catch (NullPointerException e){
            System.out.println("发送器不存在！");
        }

        // 多工厂模式
        SendFactory_multi sendFactory_multi = new SendFactory_multi();
        Sender sms1 = sendFactory_multi.produceSms();
        Sender mail1 = sendFactory_multi.produceMail();
        sms1.Send();
        mail1.Send();

        // 静态工厂,无需创建实例直接使用
        Sender common = SendFactory_multi.produceSender();
        common.Send();
    }

    /**
     * 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
     * 在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类.
     * 所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
     */
}
