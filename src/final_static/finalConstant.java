package final_static;

/**
 * final����
 * ��final���εĳ�Ա������ʾ������ֵһ���������޷��ı�
 * final���εı��������֣���̬������ʵ�������;ֲ��������ֱ��ʾ�������͵ĳ�����
 */
public class finalConstant {
    private final String S = "finalʵ������S";
    private final int A = 100;
    public final int B = 90;

    public static final int C = 80;
    private static final int D = 70;

    public final int E; //final�հ�,�����ڳ�ʼ�������ʱ�򸳳�ֵ

    public finalConstant(int x) {
        E = x;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        finalConstant t = new finalConstant(2);
        //t.S="�޷���ֵ";    //����,final������ֵһ���������޷��ı�
        //t.A=101;    //����,final������ֵһ���������޷��ı�
        //t.B=91; //����,final������ֵһ���������޷��ı�
        //t.C=81; //����,final������ֵһ���������޷��ı�
        //t.D=71; //����,final������ֵһ���������޷��ı�

        System.out.println(t.A);
        System.out.println(t.B);
        System.out.println(t.C); //���Ƽ��ö���ʽ���ʾ�̬�ֶ�
        System.out.println(t.D); //���Ƽ��ö���ʽ���ʾ�̬�ֶ�
        System.out.println(finalConstant.C);
        System.out.println(finalConstant.D);
        //System.out.println(Test3.E); //����,��ΪEΪfinal�հ�,���ݲ�ͬ����ֵ������ͬ.
        System.out.println(t.E);

        finalConstant t1 = new finalConstant(3);
        System.out.println(t1.E); //final�հױ���E���ݶ���Ĳ�ͬ����ͬ

        t.test();
        System.out.println(t.S);
        t1.test();
        t1.test2();

    }

    private void test() {
        System.out.println(new finalConstant(1).A);
        System.out.println(finalConstant.C);
        System.out.println(finalConstant.D);
        System.out.println(new finalConstant(A).E);
    }

    public void test2() {
        final int a;     //final�հ�,����Ҫ��ʱ��Ÿ�ֵ
        final int b = 4;    //�ֲ�����--final���ھֲ�����������
        final int c;    //final�հ�,һֱû�и���ֵ.
        a = 3;
        //a=4;    ����,�Ѿ�������ֵ��.
        //b=2; ����,�Ѿ�������ֵ��.
    }
}
