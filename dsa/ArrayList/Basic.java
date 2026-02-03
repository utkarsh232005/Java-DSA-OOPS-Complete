package dsa.ArrayList;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // ADD OPERATION
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);

        // GET OPERATION
        int element = list.get(3); // ==4
        System.out.println(element);

        // SET OPERATION
        list.set(2, 33);
        System.out.println(list);

        // REMOVE OPERATION
        list.remove(2);
        System.out.println(list);

        // CONTAINS OPERATION
        System.out.println(list.contains(45));

        // ADITIONAL ADD METHOD
        list.add(2, 10);
        System.out.println(list);

    }
}
