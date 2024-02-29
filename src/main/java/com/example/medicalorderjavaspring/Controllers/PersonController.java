package com.example.medicalorderjavaspring.Controllers;

import com.example.medicalorderjavaspring.Models.Person;
import com.example.medicalorderjavaspring.Services.interfaces.PersonServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("person")

public class PersonController {
    private final PersonServiceInterface service;

    public PersonController(PersonServiceInterface service) {

        this.service = service;
    }


    @GetMapping("/All")
    public ResponseEntity<List<Person>> getAll(){
        List<Person> people = service.getAll();
        return people.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(people, HttpStatus.OK);
    }

    @GetMapping("/{person_id}")
    public ResponseEntity<Person> getById(@PathVariable("person_id") int id){
        Person user = service.getById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //gives us an error 404

        return new ResponseEntity<>(user, HttpStatus.OK); //error 200
    }

    @PostMapping("/")
    public ResponseEntity<Person> create(@RequestBody Person user){
        Person createdUser = service.create(user);
        if(createdUser == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED); //201
    }

    @GetMapping("/surname/{person_surname}")
    public ResponseEntity<List<Person>> getAllBySurname(@PathVariable("person_surname") String surname){
        List<Person> people = service.getBySurname(surname);
        return people.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(people, HttpStatus.OK);
    }
    @PostMapping("/gender/{person_gender}")
    public ResponseEntity<List<Person>> getAllByGender(@PathVariable("person_gender") String gender){
        List<Person> people = service.getByGender(gender);
        return people.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(people, HttpStatus.OK);
    }

    @PostMapping("/age/{person_age}")
    public ResponseEntity<List<Person>> getAllByAge(@PathVariable("person_age") int age){
        List<Person> people = service.getByAge(age);
        return people.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(people, HttpStatus.OK);
    }

    @PostMapping("/role/{person_role}")
    public ResponseEntity<List<Person>> getAllByRole(@PathVariable("person_role") String role){
        List<Person> people = service.getByRole(role);
        return people.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(people, HttpStatus.OK);
    }

    public String createPerson(String name, String surname, String gender, int age, String role) {
        return service.createPerson(name, surname, gender, age, role);

    }
}
