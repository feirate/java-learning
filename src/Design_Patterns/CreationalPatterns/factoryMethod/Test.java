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
            System.out.println("�����������ڣ�");
        }

        // �๤��ģʽ
        SendFactory_multi sendFactory_multi = new SendFactory_multi();
        Sender sms1 = sendFactory_multi.produceSms();
        Sender mail1 = sendFactory_multi.produceMail();
        sms1.Send();
        mail1.Send();

        // ��̬����,���贴��ʵ��ֱ��ʹ��
        Sender common = SendFactory_multi.produceSender();
        common.Send();
    }

    /**
     * ������˵������ģʽ�ʺϣ����ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ������ͨ����������ģʽ���д�����
     * �����ϵ�����ģʽ�У���һ�����������ַ������󣬲�����ȷ�������󣬵���������ڵڶ��֣�����Ҫʵ����������.
     * ���ԣ����������£����ǻ�ѡ�õ����֡�����̬��������ģʽ��
     */
}
