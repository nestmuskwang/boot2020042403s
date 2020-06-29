package comatguigu.stratege;

/**
 * @author ：wangsg
 * @date ： 2020/6/22 15:37
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("北京鸭");
    }
    //因为北京鸭不嫩飞翔 需要重写fly（）
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
    //需要重写父类方法
}
