package java8.com.atguigu.lambda;

import org.junit.Test;

import java.security.Key;
import java.util.*;

/**
 * @author ：wangsg
 * @date ： 2020/5/10 5:59
 */
public class TestLambda {
   @Test
    public  void test01(){
       Comparator<Integer> comparator = new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return Integer.compare(o1, o2);
           }
       };
       TreeSet<Integer> ts = new TreeSet<>(comparator);
   }
   @Test
    public  void test02(){
       Comparator<Integer> comparator =(x, y) -> Integer.compare(x, y);
       TreeSet<Integer> treeSet = new TreeSet<>(comparator);
   }
    List<Employee> employeeList = Arrays.asList(
            new Employee("张三", 28,23443.2),
            new Employee("李四", 22,23443.2),
            new Employee("王五", 3238,23443.2),
            new Employee("赵六", 15,23443.2),
            new Employee("田七", 345,23443.2)   );

   public  static List<Employee> getList(List<Employee>  employeeList){
       List<Employee> arrayList = new ArrayList<>();
       for (int i = 0; i < employeeList.size(); i++) {
           if (employeeList.get(i).getAge() > 35) {
               arrayList.add(employeeList.get(i));
           }

       }
       return arrayList;
   }
   @Test
    public  void test03(){
       List<Employee> employeeList = Arrays.asList(
               new Employee("张三", 28,23443.2),
               new Employee("李四", 22,233.2),
               new Employee("王五", 3238,433.2),
               new Employee("赵六", 15,23443.2),
               new Employee("田七", 345,23443.2)   );
       List<Employee> list = getList(employeeList);
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i).toString());
       }

   }
    List<Employee> employeeLists = Arrays.asList(
            new Employee("张三", 28,23443.2),
            new Employee("李四", 22,233.2),
            new Employee("王五", 3238,433.2),
            new Employee("赵六", 15,23443.2),
            new Employee("田七", 345,23443.2)   );
   //优化方式1 设计模式  策略模式
    public  List<Employee> filterEmployee(List<Employee> list, Mypredicate<Employee> mp){
       List<Employee> employees  = new ArrayList<>();
        for (Employee employee : list) {
           if(mp.test(employee))
               employees.add(employee);
        }
       return employees;
    }

    @Test// 优化方式二 ， 匿名内部类
    public  void test5(){
       List<Employee> list = filterEmployee(employeeList, new Mypredicate<Employee>() {
           @Override
           public boolean test(Employee employee) {
               return employee.getSalary() > 30000.00;
           }
       });
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    //优化方式三 Lambda 表达式
    @Test
    public  void test06(){
        List<Employee> list = filterEmployee(employeeLists, (e) -> e.getSalary() < 5000);
        list.forEach(System.out::println);
    }
    //优化方式四  stream API

    @Test
    public void test07(){
        employeeLists.stream()
                .filter((e) -> e.getSalary() >=3000)
                .limit(1)
                .forEach(System.out::println);
        employeeLists.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
    @Test
    public void testMap(){
        Map<String ,Object> map = new HashMap<>();
        map.put("dsa","dsds");
        map.put("dsa","dsds");
        map.put("dsa","dsds");
        map.put("dsa","dsds");
        ///map.forEach();
    }
}
