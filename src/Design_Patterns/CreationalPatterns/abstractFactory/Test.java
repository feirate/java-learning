package Design_Patterns.CreationalPatterns.abstractFactory;

/**
 * Created by feirate on 2016/3/20.
 */
public class Test {
    public static void main(String[] args){
        Provider mailProvider = new MailFactory();
        Provider smsProvider = new SmsFactory();
        Sender mailSender = mailProvider.produce();
        Sender smsSender = smsProvider.produce();
        mailSender.Send();
        smsSender.Send();
    }
}
