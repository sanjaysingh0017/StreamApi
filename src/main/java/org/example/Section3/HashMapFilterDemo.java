package org.example.Section3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapFilterDemo {

    public static void main(String[] args) {
        // filter map for map values that are less than 3
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        Map<Object, Object> collect = map.entrySet().stream().filter(e -> e.getValue() < 3)
                .collect(Collectors.toMap(new Function<Map.Entry<String, Integer>, Object>() {
                    @Override
                    public Object apply(Map.Entry<String, Integer> stringIntegerEntry) {
                        return stringIntegerEntry.getKey();
                    }
                }, new Function<Map.Entry<String, Integer>, Object>() {
                    @Override
                    public Object apply(Map.Entry<String, Integer> stringIntegerEntry) {
                        return stringIntegerEntry.getValue();
                    }
                }));

        collect.entrySet().forEach(System.out::println);
    }
}
