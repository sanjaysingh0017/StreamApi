package org.example.Section4;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main( String[] args ) throws IOException {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        List<Object> collect = numbers.stream().map(n -> n*2).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

}
