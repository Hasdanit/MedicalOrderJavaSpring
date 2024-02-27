package com.example.medicalorderjavaspring.services;

import com.example.medicalorderjavaspring.models.Person;
import com.example.medicalorderjavaspring.services.interfaces.PersonServiceInterface;
import com.example.medicalorderjavaspring.repositories.PersonRepositoryInterface;
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
        return repo.findById(id).orElse(null);
    }

    @Override
    public Person create(Person user) {
        return repo.save(user);
    }

    @Override
    public List<Person> getBySurname(String surname) {
        return repo.findBySurname(surname);
    }
}
