package comatguigu.singleton;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 15:47
 */
public class Singleton7 {
    private Singleton7(){}
    private  static class  Singleton{
        private  static final Singleton7 instance = new Singleton7();
    }
    public static Singleton7 getInstance(){
        return Singleton.instance;
    }
}
