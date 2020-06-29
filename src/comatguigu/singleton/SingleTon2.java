package comatguigu.singleton;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 15:09
 * 静态代码块   可能会造成内存浪费
 */
public class SingleTon2 {
    private static  SingleTon2 singleTon2 ;
    private SingleTon2(){}
    static {
        singleTon2 = new SingleTon2();
    }
    public static SingleTon2 getInstance(){
        return singleTon2;
    }
}
