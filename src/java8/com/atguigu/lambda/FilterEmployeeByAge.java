package java8.com.atguigu.lambda;

/**
 * @author ：wangsg
 * @date ： 2020/5/11 21:08
 */
public class FilterEmployeeByAge implements Mypredicate<Employee> {

    @Override
    public boolean test(Employee emps) {
        return emps.getAge() >25;
    }
}
