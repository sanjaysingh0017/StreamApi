package org.example.Section4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoreTerminalFunctionsDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1,2,2,3,4,5,6,7,8,9);
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
