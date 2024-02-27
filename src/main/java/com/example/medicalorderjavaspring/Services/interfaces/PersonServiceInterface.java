package com.example.medicalorderjavaspring.Services.interfaces;

import com.example.medicalorderjavaspring.Models.Person;

import java.util.List;

public interface PersonServiceInterface {
    List<Person> getAll();
    Person getById(int id);
    Person create(Person user);
    List<Person> getBySurname(String surname);

    String createPerson(String name, String surname, String gender, int age, String role);
}
