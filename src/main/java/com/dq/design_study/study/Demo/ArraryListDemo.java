package com.dq.design_study.study.Demo;

import java.security.NoSuchAlgorithmException;

public class ArraryListDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        int []  nums = new int [6];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 3;
        int i = anInt(nums);
        System.out.println(i);
    }

    public static int anInt (int []  nums ){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int i1 = i+1; i1 < nums.length; i1++) {
                int num2 = nums[i1];
                if(num1 == num2){
                    a++;
                }
            }
        }
        return a;
    }
}
