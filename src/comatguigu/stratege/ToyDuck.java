package comatguigu.stratege;

/**
 * @author ：wangsg
 * @date ： 2020/6/22 15:41
 * 策略模式是将继承改为组合
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    @Override
    public void quack() {
        System.out.println("buhuijiao");
    }

    @Override
    public void swig() {
        System.out.println("buhuiyouyou");
    }

    @Override
    public void fly() {
        System.out.println("buhuifei");
    }
}
