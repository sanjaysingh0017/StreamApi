package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Section2.LoopDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReadJsonData {

    public static List<Person> getData() {
        String fileName = "MOCK_DATA.json";
        List<Person> personList = new ArrayList<>();
        StringBuilder json = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(Objects.requireNonNull(LoopDemo.class.getClassLoader().getResourceAsStream(fileName)),
                            StandardCharsets.UTF_8));
            String str;
            while ((str = in.readLine()) != null){
                ObjectMapper mapper = new ObjectMapper();
                Person person = mapper.readValue(str, Person.class);
                personList.add(person);
            }

            in.close();
        } catch (IOException e) {
            throw new RuntimeException("Caught exception reading resource " + fileName, e);
        }
        return personList;
    }
}
