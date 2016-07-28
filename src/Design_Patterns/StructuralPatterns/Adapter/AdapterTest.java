package Design_Patterns.StructuralPatterns.Adapter;

/**
 * Created by feirate on 2016/4/22.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();

        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();

    }
}
