package org.example.Section8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1ConcatenateStrings {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        String collect = words.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
