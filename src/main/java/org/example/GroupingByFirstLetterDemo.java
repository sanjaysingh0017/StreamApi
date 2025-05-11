package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByFirstLetterDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        Map<Object, List<String>> collect = words.stream().collect(Collectors.groupingBy(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                return s.charAt(0);
            }
        }));

        collect.forEach( (k,v) -> System.out.println(k + ":" + v));
    }
}
