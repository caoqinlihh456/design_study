package com.dq.design_study.study.Demo;

import java.security.NoSuchAlgorithmException;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
  示例 2:

 输入: -123
 输出: -321
 示例 3:

 输入: 120
 输出: 21
 注意:

 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/reverse-integer
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo2 {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        String s = "-12345";
        int i = anInt(-12312312);
        System.out.println(i);

    }

    public static int anInt (int a){
        String str = "";
        try {
             str = String.valueOf(a);
        }catch (Exception e){
            System.out.println("数字转换异常");
            return 0;
        }
        String s = "-";
        String abc = "";
        byte[] bytes = str.getBytes();
        byte[] bytes1 = s.getBytes();
        String o = "";
        if((bytes1[0] == bytes[0])){
             o = str.substring(0,1);
             str = str.substring(1,str.length());
            bytes = str.getBytes();
        }
        for (int i = 0; i < bytes.length/2; i++){
            byte aByte = bytes[i];
            bytes[i] = bytes[bytes.length-(i+1)];
            bytes[bytes.length-(i+1)] = aByte;
        }
        if("-".equals(o)){
            StringBuffer sb=new StringBuffer(new String(bytes));
            sb.insert(0,"-");
            abc = sb.toString();
            return Integer.parseInt(new String(abc.getBytes()));
        }
        return Integer.parseInt(new String(bytes));
    }
}
