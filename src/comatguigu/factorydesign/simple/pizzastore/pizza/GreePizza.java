package comatguigu.factorydesign.simple.pizzastore.pizza;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 19:09
 */
public class GreePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
