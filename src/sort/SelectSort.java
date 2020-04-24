package sort;

import java.util.Arrays;

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

    /**
     *  选择排序
     * @param a 时间复杂度O(n2） 空间复杂度O(1)  非稳定原地排序
     * @return
     */
    public static int[] selectSort(int [] a){
        int ln =a.length;
        for(int i=0;i<ln-1;i++){
            int min=i;
            for(int j=i+1;j<ln;j++){
                if (a[min]>a[j]) min=j;
            }
            int temp =a [i];
            a[i] =a[min ];
            a[min]=temp;
        }
        return a;



    }
    /**
     *
     */

}
