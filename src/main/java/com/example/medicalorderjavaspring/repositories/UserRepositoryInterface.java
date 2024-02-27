package com.example.medicalorderjavaspring.repositories;

import com.example.medicalorderjavaspring.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepositoryInterface extends JpaRepository<Person, Integer> {
    List<Person> findBySurname(String surname);
}
