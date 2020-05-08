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
        int volienceMatch = volienceMatch(str1, str2);
        int[] kmpNext = kmpNext(str2);
        int i = kmpSearch(str1, str2, kmpNext);
        System.out.println(volienceMatch);
        System.out.println(Arrays.toString(kmpNext));
        System.out.println(i);
    }
    //暴力匹配方法
   public static int volienceMatch(String str1, String str2){
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        int len1=str1.length();
        int len2=str2.length();
        int i=0;
        int j=0;
        while (i < len1 && j <len2){
            if(s1[i] == s2[j]){
                i++;
                j++;
            }else {
                i = i -(j - 1);
                j = 0;
            }
        }
        //判断是否匹配成功
        if(j == len2){
            return  i - j ;
        }

        return  -1 ;
   }

   //创建部分匹配值表
    public  static  int[] kmpNext(String str){
        int[] next = new int[str.length()];
        next[0] = 0;
        for (int i = 1 ,j = 0; i < str.length(); i++){
            //kpm算法核心点
            while (j > 0  && str.charAt(i) !=str.charAt(j)){
                j = next[j - 1];
            }
            if(str.charAt(i) ==str.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    //KMP 字符串匹配算法实现
    public  static  int  kmpSearch(String str1, String str2 ,int[] kmpNext){
        for(int i= 0 , j = 0 ; i < str1.length();i ++){

            while (j > 0 && str1.charAt(i) != str2.charAt(j)){
                j = kmpNext[j - 1];
            }

            if(str1.charAt(i) == str2.charAt(j)){
                j ++;
            }
            if(j == str2.length()){
                return  i - (j - 1);
            }
        }

        return -1;
    }

}
