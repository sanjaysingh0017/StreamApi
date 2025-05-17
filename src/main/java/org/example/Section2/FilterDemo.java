package org.example.Section2;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args) {

        // filter list for numbers greater than 5
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> collect = numbers.stream().filter(n -> n > 5).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
