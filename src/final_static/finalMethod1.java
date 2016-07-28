package final_static;

/**
 * final方法
 * 如果一个类不允许其子类覆盖某个方法，则可以把这个方法声明为final方法。
 * 使用final方法的原因有二：
 * 第一、把方法锁定，防止任何继承类修改它的意义和实现。
 * 第二、高效。编译器在遇到调用final方法时候会转入内嵌机制，大大提高执行效率。
 */
public class finalMethod1 {
    public void f1() {
        System.out.println("f1");
    }
    //无法被子类覆盖的方法
    public final void f2() {
        System.out.println("f2");
    }
    public void f3() {
        System.out.println("f3");
    }
    private void f4() {
        System.out.println("f4");
    }

    public void f5(){
        f4();
    }
}
