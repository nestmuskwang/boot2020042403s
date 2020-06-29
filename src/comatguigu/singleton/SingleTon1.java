package comatguigu.singleton;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 15:06
 * 静态常量
 */
public class SingleTon1 {
    private static SingleTon1 singleTon1 = new SingleTon1();//私有的属性
    private SingleTon1(){};//私有的构造器
    public static SingleTon1 getInstance(){//公有方法
        return singleTon1;
    }
}
