package org.example.Section4;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReduceWithIdentityDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Integer reduce = numbers.stream().reduce(100, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {

                System.out.println( integer + " : "+ integer2);
                return integer + integer2;
            }
        });
        System.out.println(reduce);
    }
}
