package org.example.Section2;

import org.example.Person;
import org.example.ReadJsonData;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterDemo {

    public static void main(String[] args) {
        //filter personList for all those person whose first name starts with letter R
        List<Person> personList = ReadJsonData.getData();
        List<Person> filteredPerson = personList.stream().filter(p -> p.getFirst_name().startsWith("R")).collect(Collectors.toList());
        filteredPerson.forEach(System.out::println);
    }
}
