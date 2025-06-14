package org.example.Section8;

import org.example.Person;
import org.example.ReadJsonData;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Problem6AverageSalaryOfFirstFivePerson {

    public static void main(String[] args) {
        List<Person> personList = ReadJsonData.getData();
        Double collect = personList.stream().limit(5).collect(Collectors.averagingInt(new ToIntFunction<Person>() {
            @Override
            public int applyAsInt(Person person) {
                return person.getSalary();
            }
        }));
        System.out.println(collect);

        OptionalDouble average = personList.stream().limit(5).mapToInt(new ToIntFunction<Person>() {
            @Override
            public int applyAsInt(Person person) {
                return person.getSalary();
            }
        }).average();
        System.out.println(average.getAsDouble());
    }
}
