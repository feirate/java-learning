package final_static;

/**
 * final参数
 * 当函数参数为final类型时，你可以读取使用该参数，但是无法改变该参数的值。
 * --WebAPI调用中常将参数定义为final型，防止在后续使用中被更改
 */
public class finalParameter {
    public static void main(String[] args) {
        new finalParameter().f1(2);
    }

    public void f1(final int i) {
//        i++;    //i是final类型的,值不允许改变的.
        System.out.print(i);
    }
}
