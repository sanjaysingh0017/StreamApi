package org.example.Section8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3FindSecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);
        List<Integer> sortedList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList.get(1));
    }
}
