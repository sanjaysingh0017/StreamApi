package org.example.Section6;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningDemo {

    public static void main(String[] args) {
        List<String> characters = List.of("a", "b", "c");
        String collect = characters.stream().collect(Collectors.joining(",", "{", "}"));
        System.out.println(collect);
    }
}
