package com.atguigu.queue;

import java.util.Arrays;

/**
 * 每天至少学一个算法  一种思想
 * @author ：wangsg
 * @date ： 2020/5/6 14:20
 */
public class KMPMath {
    public static void main(String[] args) {
        String str1 ="ABC CBSBSFS BSSETSSAKEV";
        String str2 ="SETSSA";

        int[] next = next(str2);
        int i = kmpSearch(str1, str2, next);
        int volience = volience(str1, str2);
        System.out.println(volience);
        System.out.println(i);
        System.out.println(Arrays.toString(next));
    }
    //   创建部分匹配表
    public  static  int[] next(String s1){
        int[] next = new int[s1.length()];
        next[0] = 0;
        for(int i = 1, j = 0 ; i<s1.length(); i++){
            while (j > 0 && s1.charAt(i) != s1.charAt(j)){
                j = next[j - 1];
            }
            if(s1.charAt(i) == s1.charAt(j)){
                j ++;
            }
            next[i] = j;
        }
        return next;
    }
    //  kmp算法
    public  static  int kmpSearch(String s1 , String s2 , int[] next){
        for(int i =0 , j =0 ;i < s1.length(); i++){
            while (j >0 && s1.charAt(i) != s2.charAt(j)){
                j = next[j -1];
            }
            if(s1.charAt(i) == s2.charAt(j)){
                j ++;
            }
            if(j == s2.length()){
                return  i - j + 1;
            }
        }

        return  -1;
    }

    //暴力匹配算法
    public  static  int volience(String s1 ,String s2){
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i ++;
                j ++;
            }else {
                i = i -(j -1);
                j = 0;
            }
        }
        if(j ==s2.length()){
            return  i - j;
        }
        return -1;
    }

}
