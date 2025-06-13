package org.example.Section6;

import org.example.Person;
import org.example.ReadJsonData;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsAveragingDemo {

    public static void main(String[] args) {
        List<Person> data = ReadJsonData.getData();
        Double average = data.stream().limit(5).collect(Collectors.averagingInt(new ToIntFunction<Person>() {
            @Override
            public int applyAsInt(Person person) {
                return person.getSalary();
            }
        }));
        System.out.println(average);
    }
}
