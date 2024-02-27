package com.example.medicalorderjavaspring.Repositories;

import com.example.medicalorderjavaspring.Models.Person;

import java.util.List;

public interface PersonRepositoryInterface {
    public List<Person> getAll();


    public Person getById(int id);

    public Person create(Person user);

    public List<Person> getBySurname(String surname);

    public String createPerson(String name, String surname, String gender, int age, String role);
}
