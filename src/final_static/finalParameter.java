package final_static;

/**
 * final����
 * ����������Ϊfinal����ʱ������Զ�ȡʹ�øò����������޷��ı�ò�����ֵ��
 * --WebAPI�����г�����������Ϊfinal�ͣ���ֹ�ں���ʹ���б�����
 */
public class finalParameter {
    public static void main(String[] args) {
        new finalParameter().f1(2);
    }

    public void f1(final int i) {
//        i++;    //i��final���͵�,ֵ������ı��.
        System.out.print(i);
    }
}
