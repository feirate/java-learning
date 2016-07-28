package final_static;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by feirate on 2016/3/20.
 */
public class finalStatic {
    private static final String strStaticFinalVar = "aaa";
    private static String strStaticVar = null;
    private final String strFinalVar = null;
    private static final int intStaticFinalVar = 0;
    private static final Integer integerStaticFinalVar = new Integer(8);
    private static final ArrayList<String> alStaticFinalVar = new ArrayList<String>();
    private static final Map mapStaticFinalVar = new HashMap<>();
    private static  Map mapStaticVar = new HashMap<>();

    private void test() {
        System.out.println("-------------ֵ����ǰ----------\r\n");
        System.out.println("strStaticFinalVar=" + strStaticFinalVar + "\r\n");
        System.out.println("strStaticVar=" + strStaticVar + "\r\n");
        System.out.println("strFinalVar=" + strFinalVar + "\r\n");
        System.out.println("intStaticFinalVar=" + intStaticFinalVar + "\r\n");
        System.out.println("integerStaticFinalVar=" + integerStaticFinalVar + "\r\n");
        System.out.println("alStaticFinalVar=" + alStaticFinalVar + "\r\n");


        //strStaticFinalVar="��������";        //����final��ʾ��̬,�����Ըı��������.
        strStaticVar = "��������";                //��ȷ��static��ʾ�����,ֵ���Ըı�.
        //strFinalVar="�ǺǺǺ�";                    //����, final��ʾ��̬���ڶ����ʱ���Ҫ��ֵ�����¸���null����һ��������Ͳ����ٸ��ġ�
        //intStaticFinalVar=2;                        //����, final��ʾ��̬���ڶ����ʱ���Ҫ��ֵ�����¸���null����һ��������Ͳ����ٸ��ġ�
        //integerStaticFinalVar=new Integer(8);            //����, final��ʾ��̬���ڶ����ʱ���Ҫ��ֵ�����¸���null����һ��������Ͳ����ٸ��ġ�
        alStaticFinalVar.add("aaa");        //��ȷ��������������û�б仯����������ݷ����˱仯����������Ƿǳ����õģ��кܶ���;��
        alStaticFinalVar.add("bbb");        //��ȷ��������������û�б仯����������ݷ����˱仯����������Ƿǳ����õģ��кܶ���;��
        mapStaticFinalVar.put("key1","val1");        //��ȷ��������������û�б仯����������ݷ����˱仯����������Ƿǳ����õģ��кܶ���;��
        mapStaticFinalVar.put("key2","val2");        //��ȷ��������������û�б仯����������ݷ����˱仯����������Ƿǳ����õģ��кܶ���;��

        System.out.println("-------------ֵ�����----------\r\n");
        System.out.println("strStaticFinalVar=" + strStaticFinalVar + "\r\n");
        System.out.println("strStaticVar=" + strStaticVar + "\r\n");
        System.out.println("strFinalVar=" + strFinalVar + "\r\n");
        System.out.println("intStaticFinalVar=" + intStaticFinalVar + "\r\n");
        System.out.println("integerStaticFinalVar=" + integerStaticFinalVar + "\r\n");
        System.out.println("alStaticFinalVar=" + alStaticFinalVar + "\r\n");
        System.out.println("alStaticFinalVar=" + mapStaticFinalVar + "\r\n");
    }

    public static void main(String args[]) {
        new finalStatic().test();
    }
}
