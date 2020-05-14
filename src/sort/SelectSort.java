package sort;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author ：wangsg
 * @date ： 2020/4/24 16:20
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] arrayList ={42,23,51,33,534,2,65,3,466,44};
        int[] ints = selectSort(arrayList);
        System.out.println(Arrays.toString(ints));
    }
    public  static  int[] selectSort(int[] arr){
       for(int i = 0; i < arr.length - 1;i ++){
           int min = i;
           for(int j = i + 1 ; j < arr.length; j++){
               if(arr[min] >arr[j])min = j;
           }
           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
       return arr;
    }

}
