package comatguigu.singleton;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 15:42
 * dcl 双重检查版单例模式
 */
public class SingleTon6 {
    private static volatile SingleTon6 instance;
    private SingleTon6(){}
    public  static SingleTon6 getInstance(){
        if(instance == null){
            synchronized (SingleTon6.class){
                if(instance == null){
                    instance = new SingleTon6();
                }
            }
        }
        return instance;
    }
}
