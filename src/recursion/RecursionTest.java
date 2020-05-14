package recursion;

import java.sql.SQLOutput;

/**
 * @author ：wangsg
 * @date ： 2020/5/14 14:43
 */
public class RecursionTest {
    public static void main(String[] args) {
        test01(10);
        int factorial = factorial(3);
        System.out.println(factorial);
    }

    public static  void test01(int n){
        if(n > 2){
            test01(n -1);
        }else {
            System.out.println("n = " + n);
        }
    }
    //阶乘问题
    public  static  int  factorial(int n){
        if(n == 1){
            return  n;
        }else {
            return  factorial(n-1)*n;
        }

    }

}
