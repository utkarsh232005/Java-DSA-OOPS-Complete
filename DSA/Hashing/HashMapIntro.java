package DSA.Hashing;

import java.util.*;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);
        System.out.println(hm);
        // get operation
        int population = hm.get("India");
        System.out.println(population);// 100
        System.out.println(hm.get("Russia"));// null
        // Contains operation
        System.out.println(hm.containsKey("India"));// true
        System.out.println(hm.containsKey("Russia"));// false

        // remove operation
        System.out.println(hm.remove("India"));// 100
        System.out.println(hm.remove("Russia"));// null
    }
}
