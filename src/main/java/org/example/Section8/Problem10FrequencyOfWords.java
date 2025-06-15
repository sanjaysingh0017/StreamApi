package org.example.Section8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem10FrequencyOfWords {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String, Long> map = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : "+ e.getValue()));
    }
}
