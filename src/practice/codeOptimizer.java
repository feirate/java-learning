package practice;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by feirate on 2016/7/26.
 */
public class codeOptimizer {
    public static void main(String[] args){
          /*
         * ������ѭ��������ʹ�ø��ӱ��ʽ
         * @author yifangyou
         * @since 2011-08-16 09:35:00
         *
         */
 test0();
    }

    /*
        * ������ѭ��������ʹ�ø��ӱ��ʽ
        * @author yifangyou
        * @since 2011-08-16 09:35:00
        */
    public static void test0() {
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < 10000000; i++) {
            a.add(i);
        }

        long startTime;
        // ѭ��������ʹ�ø��ӱ��ʽ
        startTime = new Date().getTime();
        for (int i = 0; i < a.size(); i++) {
            int j = a.get(i);
        }
        System.out.println(new Date().getTime() - startTime);

        // ѭ�������в�ʹ�ø��ӱ��ʽ
        startTime = new Date().getTime();
        for (int i = 0,maxlen = a.size();i < maxlen; i++) {
            int j = a.get(i);
        }
        System.out.println(new Date().getTime() - startTime);
    }
}
