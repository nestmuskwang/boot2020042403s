package comatguigu.stratege;

/**
 * @author ：wangsg
 * @date ： 2020/6/22 7:19
 */
public abstract class Duck {

    public Duck() {
    }
    public abstract void display();
    public void  quack(){
        System.out.println("嘎嘎叫");
    }
    public  void swig(){
        System.out.println("h会游泳");
    }
    public void fly(){
        System.out.println("会飞");
    }
}
