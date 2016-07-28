package Design_Patterns.CreationalPatterns.builder;

/**
 * ����ģʽ�ǽ����ӵ��ڲ�������װ���ڲ��������ⲿ���õ�����˵��ֻ��Ҫ���뽨���ߺͽ��칤�ߣ������ڲ�����ν���ɳ�Ʒ�ģ�������������ġ�
 *
 */
// ����������Builder
public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}
