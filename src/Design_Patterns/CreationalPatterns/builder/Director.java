package Design_Patterns.CreationalPatterns.builder;

/**
 * Created by feirate on 2016/3/22.
 */
//НЈдьеп
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}