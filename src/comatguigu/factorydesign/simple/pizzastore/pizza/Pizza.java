package comatguigu.factorydesign.simple.pizzastore.pizza;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 19:03
 * 将Pizza做成抽象类
 */
public abstract class Pizza {
    protected String name;
    //准备原材料， 不同披萨不一样， 因此做成抽象方法
    public abstract void prepare();
    public void bake() {
        System.out.println(name + " baking;");
    }
    public void cut() {
        System.out.println(name + " cutting;");
    }
    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }
    public void setName(String name) {
        this.name = name;
    }

}
