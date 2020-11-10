package com.dq.design_study.study.Demo;

/**
 * 递归练习
 */
public class Demo6 {
    public static void main(String[] args) {
//        System.out.println(getNum(24));
//        System.out.println(multiply(6, 5));
        System.out.println(addDigits(38));
    }

    //    描述：每 3 个可乐盖可兑换 1 瓶子可乐，求买 n 瓶可乐最终可获得的可乐瓶子数。
    public static int getNum(int num) {
        if (num < 3) {
            return num;
        }
        num = num - 3;
        return 4 + getNum(num);
    }

    public static int multiply(int A, int B) {
        if (A == 0) {
            return 0;
        }
        if (B == 0) {
            return 0;
        }

        if (A > B) {
            return A + multiply(A, B - 1);
        } else {
            return B + multiply(A - 1, B);
        }

    }

    public static int addDigits(int num) {
        int sum = 0;
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            sum = sum + Integer.valueOf(chars[i]+"");
        }
        if(sum < 10){
            return sum;
        }
        return addDigits(sum);
    }


}
