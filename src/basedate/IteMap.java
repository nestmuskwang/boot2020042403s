package basedate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

/**
 * @author ：wangsg
 * @date ： 2020/4/29 15:32
 */
public class IteMap {


    public static void main(String[] args) {

        Map<String,Object> maps=new HashMap<>();
        maps.put("aa","AA");
        maps.put("bb","BB");
        maps.put("cc","CC");
        maps.put("dd","DD");
       /* Iterator iterator=maps.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry= (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            String value= (String) entry.getValue();
            System.out.println("key："+key);
            System.out.println("value："+value);
        }*/
        Iterator iterator1=maps.keySet().iterator();
        while (iterator1.hasNext()){
            String key = (String) iterator1.next();
            String  value= (String) maps.get(key);
            System.out.println("key"+key  +"value:::"+value);
        }
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");

        Iterator iterator=maps.values().iterator();
        while (iterator.hasNext()){
            String value= (String) iterator.next();
            System.out.println(value);
        }
    }
}
