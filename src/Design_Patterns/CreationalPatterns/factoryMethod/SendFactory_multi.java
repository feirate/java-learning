package Design_Patterns.CreationalPatterns.factoryMethod;

/**
 * �����������ģʽ���Ƕ���ͨ��������ģʽ�ĸĽ�,�����������ģʽ���ṩ��������������ֱ𴴽�����
 */
public class SendFactory_multi {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    /**
     * ��̬����
     */
    public static Sender produceSender(){
        return new CommonSender();
    }
}
