package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByLengthDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        words.stream()
                .collect(Collectors.groupingBy(String::length))
                .forEach((key, value) -> System.out.println(key + " -> " + value.size()));
    }
}
