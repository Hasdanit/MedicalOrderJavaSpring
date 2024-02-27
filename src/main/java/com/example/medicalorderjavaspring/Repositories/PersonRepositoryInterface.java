package com.example.medicalorderjavaspring.Repositories;

import com.example.medicalorderjavaspring.Models.Person;

import java.util.List;

public interface PersonRepositoryInterface {
    public List<Person> findAll();


    public Person getById(int id);

    public Person create(Person user);

    public List<Person> getBySurname(String surname);
    public Person findById(int id);

    public Person save(Person user);
    public List<Person> findBySurname(String surname);
    List<Person> getByAge(int age);
    List<Person> getByRole(String role);

    public String createPerson(String name, String surname, String gender, int age, String role);
}
