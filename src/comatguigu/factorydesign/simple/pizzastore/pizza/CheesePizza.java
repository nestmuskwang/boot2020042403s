package comatguigu.factorydesign.simple.pizzastore.pizza;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 19:07
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给披萨准备原材料");
    }
}
