package Hashing;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("USA", 100);

        // Set<String> keys = hm.keySet();

        // for (String k : keys) {
        // System.out.println(k + " " + hm.get(k));
        // }

        // for (Map.Entry<String, Integer> entry : hm.entrySet()) {
        // System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        // System.out.println(hm.get("India"));
        // hm.remove("China");
        // System.out.println(hm.containsKey("USA"));
        // System.out.println(hm);
        // System.out.println(hm.size());
        // System.out.println(hm);
    }
}
