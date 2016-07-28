package Design_Patterns.CreationalPatterns.builder;

/**
 * 建造模式是将复杂的内部创建封装在内部，对于外部调用的人来说，只需要传入建造者和建造工具，对于内部是如何建造成成品的，调用者无需关心。
 *
 */
// 抽象建造者类Builder
public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}
