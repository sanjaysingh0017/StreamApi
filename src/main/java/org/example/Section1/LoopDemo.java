package org.example.Section1;

import java.io.*;
import java.util.List;

public class LoopDemo {
    public static void main( String[] args ) throws IOException {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        numbers.stream().forEach(System.out::println);
    }

}
