package org.example.Section4;

import org.example.Person;
import org.example.ReadJsonData;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class PersonSalaryTerminalFunctionsDemo {

    public static void main(String[] args) {
        List<Person> data = ReadJsonData.getData();
        // total number of persons
        long count = data.stream().count();
        System.out.println(count);
        // min,max,sum of salary of first five persons
        Optional<Person> min = data.stream().limit(5).min(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getSalary(), o2.getSalary());
            }
        });
        System.out.println(min.get());

        Optional<Person> max = data.stream().limit(5).max(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getSalary(), o2.getSalary());
            }
        });
        System.out.println(max.get());
        Integer sum = data.stream().limit(5).reduce(0, new BiFunction<Integer, Person, Integer>() {
            @Override
            public Integer apply(Integer integer, Person person) {
                return integer + person.getSalary();
            }
        }, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });
        System.out.println(sum);
    }
}
