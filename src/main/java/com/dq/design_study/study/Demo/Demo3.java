package com.dq.design_study.study.Demo;

import java.security.NoSuchAlgorithmException;

/**
 * 实现 strStr() 函数。

 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

 示例 1:

 输入: haystack = "hello", needle = "ll"
 输出: 2
 示例 2:

 输入: haystack = "aaaaa", needle = "bba"
 输出: -1
 说明:

 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/implement-strstr
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */



public class Demo3 {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        System.out.println(strStr("",""));
    }

    public static int strStr (String haystack, String needle){
        boolean flag = haystack.contains(needle);
        if(!flag){
            return -1;
        }
        Integer a = null ;
        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            char c = chars1[i];
            if(a !=  null){
                break;
            }
            for (int i1 = 0; i1 < chars2.length; i1++) {
                char c2 = chars2[i1];
                if(c == c2){
                    char cc = chars1[i + chars2.length - 1];
                    if(cc == chars2[chars2.length-1]){
                        a = i;
                        break;
                    }
                }
            }
        }
        if(a == null){
            a = -1;
        }
        return a;
    }
}
