package Design_Patterns.CreationalPatterns.factoryMethod;

/**
 * Created by feirate on 2016/3/20.
 */
public class CommonSender implements Sender{

    @Override
    public void Send(){
        System.out.println("this is a Sender");
    }
}
