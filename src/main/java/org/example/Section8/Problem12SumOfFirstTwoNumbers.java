package org.example.Section8;

import java.util.List;
import java.util.function.BinaryOperator;

public class Problem12SumOfFirstTwoNumbers {

    public static void main(String[] args) {
        List<Integer> integers = List.of(23, 5, 3, 2, 354);
        Integer sum = integers.stream().limit(2).reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.println(sum);
    }
}
