package Design_Patterns.CreationalPatterns.abstractFactory;

/**
 * Created by feirate on 2016/3/20.
 */
public class SmsSender implements Sender {
    @Override
    public void Send(){
        System.out.println("smsSender");
    }
}
