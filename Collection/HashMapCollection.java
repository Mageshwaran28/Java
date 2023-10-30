package Collection;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println(map);

        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("Zero", 0);
        map1.putAll(map);
        System.out.println(map1);

        map.putIfAbsent("Zero", 01); // key is not present then value is added to map
        map1.putIfAbsent("Zero", 01);
        System.out.println(map);
        System.out.println(map1);

        System.out.println("Is Empty : " + map.isEmpty());
        System.out.println("Size of map is: " + map.size());

        HashMap<String, Integer> cloneMap = (HashMap<String, Integer>) map.clone();
        System.out.println("cloneMap : " + cloneMap);

        System.out.println("Conatins Key : " + map.containsKey("Three")); // It is case sensitive
        System.out.println("Conatins Value : " + map.containsValue(3));

        System.out.println("Get : " + map.get("Three")); // parameter is a specified key . If it is not then return null

        map.replace("Zero", 0);

        System.out.println("GetOrDefault : ");
        System.out.println(map.getOrDefault("Zero", -1));
        System.out.println(map.getOrDefault("Five", -1));

        map.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });

        // Set View
        System.out.println(map.entrySet());

        System.out.println("Print Entry set usong foreach loop ");
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("Print the keys using foreach loop ");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Print the values using foreach loop ");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

    }
}
