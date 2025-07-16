package org.example.Section4;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoreTerminalFunctionsDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1,2,2,3,4,5,6,7,8,9);
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    public static class BoxedSummaryStatisticsDemo {

        public static void main(String[] args) {
            IntStream stream = IntStream.range(3, 8);
            IntSummaryStatistics intSummaryStatistics = stream.summaryStatistics();
            System.out.println(intSummaryStatistics);
        }
    }
}
