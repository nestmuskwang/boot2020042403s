package sort;

import java.util.Arrays;

/**
 * @author ：wangsg
 * @date ： 2020/4/26 15:51
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arrayList ={42,51,33,534,23,2,65,3,466,44};
       // int []arrayList= {1,2,3,4,5,6,6,7};
         bubbleSort(arrayList);
        System.out.println(Arrays.toString( arrayList));
    }
    public  static  void  bubbleSort(int [] array) {
        if(null == array && array.length < 2){
            return ;
        }
        boolean flag = true;
        for(int i = 0 ; i < array.length - 1 ; i ++){
            for( int j = 0 ; j <array.length -1 ; j ++){
                if(array[j] > array[j + 1]){
                    flag = false;
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            if(flag){
                break;
            }else {
                flag = true;
            }
        }

    }
}
