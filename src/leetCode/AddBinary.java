package jtest.com.leetCode;

import static java.lang.System.out;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * 二进制数相加计算返回相加结果。
 * 二进制数由0和1组成,取位数长的数为基准循环，从低位分别取出两个二进制数的数值。
 * 将数值相加并记录进位。对结果除以2分别取余取整，余数为结果对应位的数值，整数为进位值。
 * 将所有位的结果和最高位的进位值拼接成相加的结果。
 *
 * For example,
 * a = "111"
 * b = "10"
 * Return "1001".
 */
public class AddBinary {
  public static String add(String a, String b) {
    int len = Math.max(a.length(), b.length()); // 取出位数较长的数
    System.out.println(len);
    String res = ""; // 用于记录余数与结果
    int carry = 0; // 用于记录进位
    for (int i = 0; i < len; i++) {
      int ca = i < a.length() ? a.charAt(a.length() - i - 1) - '0' : 0; // 从低位开始取值，char - '0' 将char对象转换成int
      out.println("ca:   " + ca);
      int cb = i < b.length() ? b.charAt(b.length() - i - 1) - '0' : 0;
      out.println("cb:   " + cb);
      res = (ca + cb + carry) % 2 + res; // % 取余 1%2=1,0%2=0,2%2=0, 拼接低位结果
      out.println("res:  " + res);
      carry = (ca + cb + carry) / 2; // / 取整 1/2=0 没有进位 2/2=1 有进位
      out.println("carry:" + carry);
    }
    if (carry > 0) {
      res = carry + res; // 最高位如果有进位, 拼接结果
    }
    out.println("rs:   " + res);
    return res;
  }

  public static void main(String[] args) {
    out.println(add("111", "10"));
  }
}
