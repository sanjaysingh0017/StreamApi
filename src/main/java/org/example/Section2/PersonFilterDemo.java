package org.example.Section2;

import org.example.Person;
import org.example.ReadJsonData;

import java.util.List;

public class PersonFilterDemo {

    public static void main(String[] args) {
        //filter personList for all those person whose first name starts with letter R
        List<Person> personList = ReadJsonData.getData();
    }
}
