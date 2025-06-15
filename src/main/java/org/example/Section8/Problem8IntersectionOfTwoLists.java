package org.example.Section8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem8IntersectionOfTwoLists {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 7, 9);
        List<Integer> list2 = List.of(2, 3, 7, 8, 10);
        List<Integer> collect = list1.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return list2.contains(integer);
            }
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
