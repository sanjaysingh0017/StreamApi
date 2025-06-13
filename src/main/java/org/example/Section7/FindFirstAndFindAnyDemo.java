package org.example.Section7;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FindFirstAndFindAnyDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Stream<Object> objectStream = numbers.stream().flatMap(new Function<Integer, Stream<?>>() {
            @Override
            public Stream<?> apply(Integer integer) {
                return Stream.of(1,2,3);
            }
        });

        objectStream.forEach(System.out::println);


    }
}
