package Dsa.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TypesOfMap {
    public static void main(String[] args) {
        //Unordered return type
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "Mayank");
        map.put(2, "Arun");
        map.put(7, "Anjali");
        map.put(3, "Karan");
        System.out.println("Hashmap class map look like : " + map);

        //Order of insertion retained in LinkedHashMap
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(4, "Mayank");
        map1.put(2, "Arun");
        map1.put(7, "Anjali");
        map1.put(3, "Karan");
        System.out.println("LinkedHashMap class map look like : " + map1);

        //Sorted output on the basis of the keys
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(4, "Mayank");
        map2.put(2, "Arun");
        map2.put(7, "Anjali");
        map2.put(3, "Karan");
        System.out.println("TreeMap class map look like : " + map2);
    }
}
