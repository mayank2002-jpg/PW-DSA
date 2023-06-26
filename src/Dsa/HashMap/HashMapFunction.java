package Dsa.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapFunction {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        //Functionality of put() function
        hashMap.put(1, "Mayank");
        hashMap.put(2, "Rahul");
        hashMap.put(3, "Karan");
        hashMap.put(4, "Bhuvan");

        System.out.println("Hashmap of the given data is " + hashMap);

        //Functionality of get() function
        System.out.println("The value for the given key is " + hashMap.get(3));

        //Functionality of containsKey() function
        System.out.println(hashMap.containsKey(2));

        //Functionality of the remove() function
        hashMap.remove(2);
        System.out.println("Updated hashmap " + hashMap);

        //Iterating using for loop
        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
            System.out.println("Hashmap is: " + e.getKey() + ":" + e.getValue());
        }
    }
}
