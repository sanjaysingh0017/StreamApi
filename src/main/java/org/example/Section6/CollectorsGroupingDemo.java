package org.example.Section6;

import org.example.Person;
import org.example.ReadJsonData;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsGroupingDemo {

    public static void main(String[] args) {
        List<Person> personList = ReadJsonData.getData();
        TreeMap<String, Map<Integer, List<Person>>> map = personList.stream().limit(10).collect(Collectors.groupingBy(new Function<Person, String>() {

            @Override
            public String apply(Person person) {
                return person.getGender();
            }
        }, TreeMap::new, Collectors.groupingBy(new Function<Person, Integer>() {
            @Override
            public Integer apply(Person person) {
                return person.getSalary();
            }
        })));
        map.entrySet().forEach( e -> System.out.println(e.getKey() + " : " + e.getValue()) );
    }
}
