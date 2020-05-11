package sort;

/**
 * @author ：wangsg
 * @date ： 2020/4/28 18:00
 */
public class MergeSort {


    public  static  int[] mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            //对左半部分排序
            arr=mergeSort(arr,left,mid);
            arr=mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);

        }

        return arr;
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        //先用一个临时数组把他们合并汇总起来
        int[] a =new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=right){
            if(arr[i]<arr[j]){

            }
        }
    }
}
