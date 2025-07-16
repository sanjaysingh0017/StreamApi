package org.example.Section4;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedSummaryStatisticsDemo {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(4, 5, 6, 7);
        Stream<Integer> boxed = intStream.boxed();
        IntSummaryStatistics statistics = intStream.summaryStatistics();
        System.out.println(statistics);
    }
}
