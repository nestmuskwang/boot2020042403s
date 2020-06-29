package comatguigu.singleton;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 15:37
 * 实际生产过程中也可能产生问题
 */
public class SingleTon5 {
    //同步代码块
    private  static  SingleTon5 instance;
    private SingleTon5(){}
    public static SingleTon5 getInstance(){
        if(null == instance){
            synchronized (SingleTon5.class){
                instance = new SingleTon5();
            }
        }
        return  instance;
    }
}
