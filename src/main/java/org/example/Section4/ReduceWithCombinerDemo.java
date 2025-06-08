package org.example.Section4;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ReduceWithCombinerDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        String reduce = numbers.parallelStream().reduce("", new BiFunction<String, Integer, String>() {
            @Override
            public String apply(String s, Integer integer) {
                return s + " " + integer;
            }
        }, new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s + "," + s2 ;
            }
        });
        System.out.println(reduce);
    }
}
