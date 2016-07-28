package final_static;

/**
 * final常量
 * 用final修饰的成员变量表示常量，值一旦给定就无法改变
 * final修饰的变量有三种：静态变量、实例变量和局部变量，分别表示三种类型的常量。
 */
public class finalConstant {
    private final String S = "final实例变量S";
    private final int A = 100;
    public final int B = 90;

    public static final int C = 80;
    private static final int D = 70;

    public final int E; //final空白,必须在初始化对象的时候赋初值

    public finalConstant(int x) {
        E = x;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        finalConstant t = new finalConstant(2);
        //t.S="无法赋值";    //出错,final变量的值一旦给定就无法改变
        //t.A=101;    //出错,final变量的值一旦给定就无法改变
        //t.B=91; //出错,final变量的值一旦给定就无法改变
        //t.C=81; //出错,final变量的值一旦给定就无法改变
        //t.D=71; //出错,final变量的值一旦给定就无法改变

        System.out.println(t.A);
        System.out.println(t.B);
        System.out.println(t.C); //不推荐用对象方式访问静态字段
        System.out.println(t.D); //不推荐用对象方式访问静态字段
        System.out.println(finalConstant.C);
        System.out.println(finalConstant.D);
        //System.out.println(Test3.E); //出错,因为E为final空白,依据不同对象值有所不同.
        System.out.println(t.E);

        finalConstant t1 = new finalConstant(3);
        System.out.println(t1.E); //final空白变量E依据对象的不同而不同

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
        final int a;     //final空白,在需要的时候才赋值
        final int b = 4;    //局部常量--final用于局部变量的情形
        final int c;    //final空白,一直没有给赋值.
        a = 3;
        //a=4;    出错,已经给赋过值了.
        //b=2; 出错,已经给赋过值了.
    }
}
