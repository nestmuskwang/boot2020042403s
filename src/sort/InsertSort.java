package sort;

import java.util.Arrays;

/**
 * @author ：wangsg
 * @date ： 2020/4/26 15:22
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] arrayList ={42,23,51,33,534,2,65,3,466,44};
        int[] ints = insertSort(arrayList);
        System.out.println(Arrays.toString(ints));
    }
    public  static  int[] insertSort(int[] arr){
        if(arr.equals(null)|| arr.length < 2){
            return arr;
        }
        for(int i = 1 ;i < arr.length; i++){
            int temp = arr [i];
            int k = i -1 ;
            while ( arr[k] >temp && k >=0){
                k --;
            }
            for(int j = i ;j >k + 1 ;j --){
                arr[j] = arr[j -1];
            }
            arr[k + 1] = temp;
        }

        return arr;
    }

}
