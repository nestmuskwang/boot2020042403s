package sort;

import java.util.Arrays;

/**
 * @author ：wangsg
 * @date ： 2020/4/26 15:51
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arrayList ={42,23,51,33,534,2,65,3,466,44};
        int[] ints = bubbleSort(arrayList);
        System.out.println(Arrays.toString(ints));
    }
    public  static  int[] bubbleSort(int [] array){
        if(array==null&& array.length<2){
            return array;
        }
        int ln=array.length;
        for(int i=0 ;i<ln;i++){
            for(int j=0;j<ln-1-i;j++){
                boolean flag=true;
                if(array[j]>array[j+1]){
                    flag=false;
                    int temp =array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
                if(false){
                    break;
                }
            }

        }

        return array;
    }
}
