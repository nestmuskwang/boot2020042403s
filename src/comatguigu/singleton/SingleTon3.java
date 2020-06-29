package comatguigu.singleton;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import sun.security.jca.GetInstance;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 15:33
 * 懒汉式线程不安全
 */
public class SingleTon3 {
    private  static SingleTon3 instance ;
    private SingleTon3(){}
    public static SingleTon3 getInstance(){
        if (null == instance){
            instance  = new SingleTon3();
        }
        return instance;
    }
}
