package com.example.medicalorderjavaspring.Repositories;

import com.example.medicalorderjavaspring.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepositoryInterface {
    public List<Person> findAll();
    public Person getById(int id);
    public Person create(Person user);
    public List<Person> getBySurname(String surname);
    public Person findById(int id);
    public Person save(Person user);
    public List<Person> findBySurname(String surname);
    List<Person> findByAge(int age);
    List<Person> getByRole(String role);

    public String createPerson(String name, String surname, String gender, int age, String role);


}
