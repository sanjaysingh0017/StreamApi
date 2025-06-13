package org.example.Section6;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorsPartitioningDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Map<Boolean, Long> map = numbers.stream().collect(Collectors.partitioningBy(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }, Collectors.counting()));
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : "+ e.getValue()));
    }
}
