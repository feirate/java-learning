package practice;

import javax.print.DocFlavor;
import java.util.*;

/**
 * Created by feirate on 2016/7/25.
 * ��ϰ 2.1��
 * ��дһ�����򣬸ó�������ڱ�׼���������ĸ����ʽ����������Ĵ�д��ĸ��
 * �������߶��� 9 �С�ÿ����д��ĸ��Ӧ����һ�� * ��ɡ����磬����������Ĵ�д��ĸ�ǡ�DJE������ô���Ӧ���������ģ�
 */
public class yourName {

    public static final List<String> D = new ArrayList<>();
   static {
       D.add("******         ");
       D.add("**      **       ");
       D.add("**        **     ");
       D.add("**         **    ");
       D.add("**         **    ");
       D.add("**        **     ");
       D.add("**      **       ");
       D.add("**    **         ");
       D.add("*****           ");
   }

    public static final Map<String,List> dicMapper = new HashMap<>();
    static {
        dicMapper.put("D",D);
    }


    public static void main(String args[]){
        String input = "DDD";
        char[] chars =  input.toCharArray();
        System.out.println(chars);
        List<String> charList = printChar(chars);
        Iterator iterator = charList.iterator();
        while (iterator.hasNext()){
            System.out.println((String)iterator.next());
        }
    }
    private static List<String> printChar(char[] chars) {
        List<String> lines = new ArrayList<>();
        for (int i =0;i<chars.length;i++){
            String str = String.valueOf(chars[i]);
            if(dicMapper.containsKey(str)){
                Iterator iterator = dicMapper.get(str).iterator();
                int index =0;
                while (iterator.hasNext()){
                    String theChar = (String)iterator.next();
                    if(lines.size()<9){
                        lines.add(theChar);
                    } else {
                        String plus = lines.get(index);
                        lines.set(index, plus + theChar);
                    }
                    index++;
                }
            }
        }
        return lines;
    }
}
