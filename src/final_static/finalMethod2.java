package final_static;


public class finalMethod2 extends finalMethod1 {

    public void f1(){
        System.out.println("����111");
    }
    public static void main(String[] args) {
        finalMethod2 t=new finalMethod2();
        t.f1();
        t.f2(); //���ôӸ���̳й�����final����
        t.f3(); //���ôӸ���̳й����ķ���
//        t.f4(); //����ʧ�ܣ��޷��Ӹ���̳л��
        t.f5(); //���ôӸ���̳е�
    }
}
