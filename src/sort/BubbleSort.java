package sort;

import java.util.Arrays;

/**
 * @author ：wangsg
 * @date ： 2020/4/26 15:51
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arrayList ={42,23,51,33,534,2,65,3,466,44};
       // int []arrayList= {1,2,3,4,5,6,6,7};
        int[] ints = bubbleSort(arrayList);
        System.out.println(Arrays.toString(ints));
    }
    public  static  int[] bubbleSort(int [] array){
        if(array == null && array.length<2){
            return array;
        }
        for(int i = 0 ;i < array.length ; i ++){
            boolean flag = false;
            for (int j = i + 1 ;j <array.length ;j ++){
                if(array[i] > array[j]){
                    flag = true;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            if(!flag){
                System.out.println(i);
                break;
            }else {
                flag = false;
            }
        }
        return array;
    }
}
