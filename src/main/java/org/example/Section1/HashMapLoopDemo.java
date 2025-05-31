package org.example.Section1;

import java.util.HashMap;
import java.util.Map;

public class HashMapLoopDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : "+ e.getValue()));
    }
}
