package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLongestStringDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        Optional<String> max = words.stream()
                .max(Comparator.comparingInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String value) {
                        return value.length();
                    }
                }));
        System.out.println(max.get());
    }
}
