package sort;

import java.util.Arrays;

/**
 * 快速排序 ，核心就是找到中间值 ， 用到分治和递归
 * @author ：wangsg
 * @date ： 2020/4/28 17:59
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr =  {7, 1, 3, 5, 13, 9, 3, 6, 11};
        int left = 0;
        int right = arr.length - 1;
        int[] ints = quickSort(arr, left, right);
        System.out.println(Arrays.toString(ints));
    }
    public  static  int[] quickSort(int[] arr, int left, int right){
        if(left < right){
            int mid =middlePosition(arr , left , right);
            quickSort(arr, left ,mid - 1);
            quickSort(arr, mid + 1 , right);
        }
        return  arr;
    }

    private static int middlePosition(int[] arr, int left, int right) {
        int povit = arr[left];
        int i  = left + 1 ;
        int j = right ;
        while (true){

            while (i <= j && arr[i] <= povit){
                i ++;
            }
            while (i <= j && arr[j] >= povit){
                j--;
            }

            if (i > j){ break;}
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        arr[left] = arr [j];
        arr[j] = povit;

        return j;
    }
}
