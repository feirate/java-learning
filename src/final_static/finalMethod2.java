package final_static;


public class finalMethod2 extends finalMethod1 {

    public void f1(){
        System.out.println("中文111");
    }
    public static void main(String[] args) {
        finalMethod2 t=new finalMethod2();
        t.f1();
        t.f2(); //调用从父类继承过来的final方法
        t.f3(); //调用从父类继承过来的方法
//        t.f4(); //调用失败，无法从父类继承获得
        t.f5(); //调用从父类继承的
    }
}
