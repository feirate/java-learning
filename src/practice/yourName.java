package practice;

import javax.print.DocFlavor;
import java.util.*;

/**
 * Created by feirate on 2016/7/25.
 * 练习 2.1：
 * 编写一个程序，该程序可以在标准输出里以字母的形式输出你姓名的大写字母，
 * 输出结果高度有 9 行。每个大写字母都应该由一堆 * 组成。例如，如果你姓名的大写字母是“DJE”，那么输出应该是这样的：
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
