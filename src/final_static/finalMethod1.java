package final_static;

/**
 * final����
 * ���һ���಻���������า��ĳ������������԰������������Ϊfinal������
 * ʹ��final������ԭ���ж���
 * ��һ���ѷ�����������ֹ�κμ̳����޸����������ʵ�֡�
 * �ڶ�����Ч������������������final����ʱ���ת����Ƕ���ƣ�������ִ��Ч�ʡ�
 */
public class finalMethod1 {
    public void f1() {
        System.out.println("f1");
    }
    //�޷������า�ǵķ���
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
