package basedate;

import basedate.entry.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：wangsg
 * @date ： 2020/4/29 16:02
 */
public class LambdaStream {
    public static List<User> users(){
        List<User> list = Arrays.asList(
                new User("李星云", 18, 0, "渝州",new BigDecimal(1000)),
                new User("陆林轩", 16, 1, "渝州",new BigDecimal(500)),
                new User("姬如雪", 17, 1, "幻音坊",new BigDecimal(800)),
                new User("姬如雪", 17, 1, "幻音坊",new BigDecimal(800)),
                new User("袁天罡", 99, 0, "藏兵谷",new BigDecimal(100000)),
                new User("张子凡", 19, 0, "天师府",new BigDecimal(900)),
                new User("陆佑劫", 45, 0, "不良人",new BigDecimal(600)),
                new User("张天师", 48, 0, "天师府",new BigDecimal(1100)),
                new User("蚩梦", 18, 1, "万毒窟",new BigDecimal(800))
        );
        return list;
    }

    public static void main(String[] args) {
        /*
          条件过滤
         */
        List<User> list=users();
        /*List<User> collect = list.stream().filter(user -> user.getAge() > 20)
                .collect(Collectors.toList());
        */
       // List<User> collect = list.stream().distinct().collect(Collectors.toList());
        /*List<User> collect = list.stream().sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
*/
       /* List<User> collect = list.stream().sorted(Comparator.comparingInt(User::getAge))
                .limit(2).collect(Collectors.toList());*/

        /*List<User> collect = list.stream().sorted(Comparator.comparingInt(User::getAge))
                .skip(2).collect(Collectors.toList());*/
        List<String> collect = list.stream().map(User::getName).distinct().collect(Collectors.toList());
        for (String user : collect) {
            System.out.println(user);
        }
    }
}
