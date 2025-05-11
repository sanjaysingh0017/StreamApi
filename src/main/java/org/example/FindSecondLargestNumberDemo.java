package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondLargestNumberDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);
        List<Integer> collect = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect.get(1));
    }
}
