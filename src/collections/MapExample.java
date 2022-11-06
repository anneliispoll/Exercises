package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        //add values to Map
        map.put("Bob", 900);
        map.put("John", 920);
        //map.put("John", 1000); same key will override

        System.out.println(map);

        //get value from key
        System.out.println("John's salary: " + map.get("John"));

        //All key values
        System.out.println(map.keySet());

        //size
        System.out.println(map.size());

        //check if Map contains key
        System.out.println(map.containsKey("Tony"));

        //check if Map contains value
        System.out.println(map.containsValue(900));

        //remove key/value pair from Map
        map.remove("Bob");
        System.out.println(map);

        //Example

        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Finland", "Helsinki");

        System.out.println(capitalCity.get("Finland"));

        for(Map.Entry<String, String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
