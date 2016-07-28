package Design_Patterns.CreationalPatterns.factoryMethod;

/**
 * 多个工厂方法模式，是对普通工厂方法模式的改进,多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class SendFactory_multi {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    /**
     * 静态工厂
     */
    public static Sender produceSender(){
        return new CommonSender();
    }
}
