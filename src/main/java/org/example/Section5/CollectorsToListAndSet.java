package org.example.Section5;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToListAndSet {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Set<Integer> collect = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }
}
