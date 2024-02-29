package com.example.medicalorderjavaspring.Services;

import com.example.medicalorderjavaspring.Models.Person;
import com.example.medicalorderjavaspring.Services.interfaces.PersonServiceInterface;
import com.example.medicalorderjavaspring.Repositories.PersonRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService implements PersonServiceInterface {
    private final PersonRepositoryInterface repo;

    public PersonService(PersonRepositoryInterface repo) {

        this.repo = repo;
    }

    @Override
    public List<Person> getAll() {

        return repo.findAll();
    }

    @Override
    public Person getById(int id) {

        return repo.findById(id);
    }

    @Override
    public Person create(Person user) {

        return repo.save(user);
    }
    public List<Person> getByRole(String role){
        return repo.getByRole(role);
    }

    @Override
    public List<Person> getBySurname(String surname) {

        return repo.findBySurname(surname);
    }
    @Override
    public List<Person> getByAge(int age) {

        return repo.findByAge(age);
    }
    public String createPerson(String name, String surname, String gender, int age, String role) {


        return null;
    }
}
