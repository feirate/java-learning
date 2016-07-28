package Design_Patterns.CreationalPatterns.abstractFactory;

/**
 * Created by feirate on 2016/3/20.
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
