package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

public class FakePersonDataAccessService implements PersonDao{

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
