package comatguigu.singleton;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 15:52
 */
public class Singleton8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
    }
}
enum Singleton{
    INSTANCE ;
    public void method(){
        System.out.println("aaa");
    }
}