package basedate.entry;

import java.math.BigDecimal;

/**
 * @author ：wangsg
 * @date ： 2020/4/29 16:25
 */
public class User {
    //姓名
    private String name;
    //年龄
    private Integer age;
    //性别
    private Integer sex;
    //地址
    private String address;
    //赏金
    private BigDecimal money;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public User(String name, Integer age, Integer sex, String address, BigDecimal money) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", money=" + money +
                ", address='" + address + '\'' +
                '}';
    }
}
