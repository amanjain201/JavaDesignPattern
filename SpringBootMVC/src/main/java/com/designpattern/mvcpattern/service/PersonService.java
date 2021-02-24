package com.designpattern.mvcpattern.service;

import com.designpattern.mvcpattern.model.Person;
import java.util.List;

public interface PersonService {
    Person createPerson(Person person);
    List<Person> getAllPersons();
}
