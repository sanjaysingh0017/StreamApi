package org.example.Section8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem5GroupByLength {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                return s.length();
            }
        }));
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : "+ e.getValue()));
    }
}
