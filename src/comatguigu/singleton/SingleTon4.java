package comatguigu.singleton;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 15:35
 */
public class SingleTon4 {
    //同步方法 线程安全
    private  static  SingleTon4 instance;
    private  SingleTon4(){}
    public static synchronized SingleTon4 getInstance(){
        if (null == instance){
            instance = new SingleTon4();
        }
        return instance;
    }
}
