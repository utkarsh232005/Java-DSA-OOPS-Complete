package DSA.Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapVariants {
    TreeMap<String, Integer> tm = new TreeMap<>();
    LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
    HashMap<String, Integer> hm = new HashMap<>();

    public HashMapVariants() {
        // Populate all maps with the same data
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);
        hm.put("Nepal", 5);

        lm.put("India", 100);
        lm.put("US", 50);
        lm.put("China", 150);
        lm.put("Nepal", 5);

        tm.put("India", 100);
        tm.put("US", 50);
        tm.put("China", 150);
        tm.put("Nepal", 5);
    }

    public static void main(String[] args) {
        HashMapVariants obj = new HashMapVariants();
        System.out.println("HashMap (Random Order): " + obj.hm);
        System.out.println("LinkedHashMap (Insertion Order): " + obj.lm);
        System.out.println("TreeMap (Sorted Key Order): " + obj.tm);
    }
}
