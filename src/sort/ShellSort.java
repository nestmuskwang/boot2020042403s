package sort;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author ：wangsg
 * @date ： 2020/4/26 17:10
 */
public class ShellSort {
    public static void main(String[] args) {
        int [] arrayList ={42,23,51,33,534,2,65,3,466,44};
        int[] ints = shellSort(arrayList);
        System.out.println(Arrays.toString(ints));
    }
    private static  int [] shellSort(int[] arr){
        if(arr==null&&arr.length<2){
            return  arr;
        }
        int n=arr.length;
        for(int h=n/2;h>0;h/=2){
            for(int i=h;i<n;i++){
                inserSort(arr,h,i);
            }
        }
        return arr;
    }
    private static void inserSort(int[] arr, int h, int i) {
        int temp=arr[i];
        int k;
        for(k=i-h;k>=0&&temp<arr[k];k-=h){
            arr[k+h]=arr[k];
        }
        arr[k+h]=temp;
    }

}
