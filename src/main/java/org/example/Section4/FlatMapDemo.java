package org.example.Section4;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        Stream<Integer> objectStream = lists.stream().flatMap(new Function<List<Integer>, Stream<Integer>>() {
            @Override
            public Stream<Integer> apply(List<Integer> integers) {
                return integers.stream();
            }
        });
        List<Integer> lists1 = List.of(1,2,3,4);
        Stream<Integer> objectStream1 = lists1.stream().flatMap(new Function<Integer, Stream<? extends Integer>>() {
            @Override
            public Stream<? extends Integer> apply(Integer integer) {
                return Stream.of(100,101);
            }
        });
        objectStream.forEach(System.out::println);
    }
}
