package com.atguigu.queue;

/**
 * @author ：wangsg
 * @date ： 2020/5/3 20:23
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {

    }

}

class  ArrayQueue{
    private  int maxSize ; //队列最大长度
    private  int front ;  //指向队列头前一个位置
    private  int rear ;  // 指向队列尾部前一个位置
    private  int[] arr;  // 承载数据的数组
    // 创建一个构造器
    public  ArrayQueue(int maxSizeArr){
        maxSize = maxSizeArr;
        arr = new int[maxSize - 1];
        rear = -1;
        front = -1;
    }
    // 判断队列是否为空
    public  boolean isEmpty(){
        return  front == rear;
    }
    //判断是否已满
    public  boolean isFull(){
        return  rear == maxSize - 1;
    }
    // 添加方法
    public void addQueue(int add){
        //判断是否已满
        if(isFull()){
            System.out.println("队列已经满了");
            return;
        }
        rear++;
        arr[rear] =add;
    }
    //获取方法
    public  int getQueue(){
        //判空
        if(isEmpty()){
           throw new  RuntimeException("队列为空");
        }
        front ++;
        return arr[front];
    }
    //遍历队列
    public void   show (){
        //判空
        if(isEmpty()){
            System.out.println("队列为空 ");
        }
        for(int i = 0; i < arr.length;i++){
            System.out.printf("arr[%d] =%d" + i + arr[i]);
        }
    }


}