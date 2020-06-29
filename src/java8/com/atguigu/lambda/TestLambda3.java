package java8.com.atguigu.lambda;


import jdk.nashorn.internal.runtime.arrays.IteratorAction;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author ：wangsg
 * @date ： 2020/6/29 19:45
 * java 8 内置的四大核心函数式接口
 * Consumer<T> : 消费型接口
 *      void accept(T t)
 *Supplier<T> ：供给型接口
 *      T get();
 * Function<T,R> : 函数型接口
 *    R apply(T t);
 *
 * Predicate<T> ： 断言型接口  做判断操作的
 *      boolean test(T t);
 */
public class TestLambda3 {
    //Consumer<T> 消费型接口

    @Test
    public  void test01(){
        happy(1000,(m) ->{
            System.out.println(m * 10);
        });
    }
    public void  happy(double money, Consumer<Double> con){
        con.accept(money);
    }

    //Supplier<T> 供给型接口
    @Test
    public  void test02(){
        List<Integer> numList = getNumList(10, () ->
                (int) (Math.random()*100));
        for (Integer integer : numList) {
            System.out.println(integer);
        }
    }

    public List<Integer> getNumList(int num, Supplier<Integer> sub){
        List<Integer> list  = new ArrayList<>();
        for (int i = 0; i <num; i++) {
            Integer n = sub.get();
            list.add(n);
        }
        return list;
    }
    @Test
    public  void test03(){
        String s = strHandler("\t\t\t   我大尚硅谷威武", (str) -> str.trim());
        System.out.println(s);
    }
    //function<T,R) 函数型接口：
    public String strHandler(String str, Function<String, String> fun){
        return fun.apply(str);
    }

    @Test
    public  void test04(){
        List<String> list = Arrays.asList("hello", "a" ,"dasa" ,"dadsaasfwe");
        List<String> list1 = filterStr(list, (s) -> s.length() > 3);
        for (String s : list1) {
            System.out.println(s);
        }
    }
    //Predicate<T> 断言型接口：
    //需求 ： 将满足条件的字符串放入集合中
    public  List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> strList = new ArrayList<>();
        for (String str : strList) {
            if(pre.test(str)){
                strList.add(str);
            }
        }
        return  strList;
    }

}
