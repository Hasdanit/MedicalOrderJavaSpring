package com.example.medicalorderjavaspring.Repositories;

import com.example.medicalorderjavaspring.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepositoryInterface extends JpaRepository<Person, Integer>{
    List<Person> findAll();
    Person getById(int id);
    Person create(Person user);
    List<Person> getBySurname(String surname);
    Person findById(int id);
    Person save(Person user);
    List<Person> findBySurname(String surname);
    List<Person> findByAge(int age);
    List<Person> getByRole(String role);
    List<Person> findByGender(String gender);

    String createPerson(String name, String surname, String gender, int age, String role);



}
