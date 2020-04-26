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
    public  static  int[] insertSort(int [] array){
        if(array==null&&array.length<2){
            return  array;
        }
        int ln=array.length;
        for(int i=1;i<ln;i++){
            int temp =array[i];
            int k=i-1;
            while (k>=0&& array[k]>array[i]){
                k--;
            }
            for(int j=i;j>k+1;j--){
                array[j]=array[j-1];
            }
            array[k+1]=temp;
        }
        return array;
    }

}
