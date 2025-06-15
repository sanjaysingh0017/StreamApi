package org.example.Section8;

import java.util.List;
import java.util.Optional;

public class Problem9FindNthSmallestNumber {

    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 1, 7, 13, 2, 14, 6); // 1,2,6,7,10, 13, 14
        Optional<Integer> first = integers.stream().sorted().skip(4).findFirst();
        System.out.println(first.get());
    }
}
