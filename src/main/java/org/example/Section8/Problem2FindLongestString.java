package org.example.Section8;

import java.util.*;
import java.util.function.ToIntFunction;

public class Problem2FindLongestString {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pineapple", "date");
        Optional<String> max = words.stream().max(Comparator.comparingInt(String::length));
        System.out.println(max.get());
    }
}
