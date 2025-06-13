package org.example.Section5;

import org.example.Person;
import org.example.ReadJsonData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectorsToMapDemo {

    public static void main(String[] args) {
        List<Person> data = ReadJsonData.getData();
        Map<Integer, Person> collect = data.stream().limit(5).collect(Collectors.toMap(new Function<Person, Integer>() {

            @Override
            public Integer apply(Person person) {
                return person.getSalary();
            }
        }, new Function<Person, Person>() {
            @Override
            public Person apply(Person person) {
                return person;
            }
        }, new BinaryOperator<Person>() {
            @Override
            public Person apply(Person person, Person person2) {
                return new Person();
            }
        }, new Supplier<Map<Integer, Person>>() {
            @Override
            public Map<Integer, Person> get() {
                Map<Integer, Person> map = new HashMap();
                map.put(0, new Person());
                return map;
            }
        }));

        collect.entrySet().forEach( e -> System.out.println(e.getKey() + " : "+e.getValue()));
    }
}
