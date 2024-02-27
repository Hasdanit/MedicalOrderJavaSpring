package com.example.medicalorderjavaspring.controllers;

import com.example.medicalorderjavaspring.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping

public class UserController {
    private final Person service;

    public UserController(Person service) {
        this.service = service;
    }

    @GetMapping
    public String sayHello(){
        return "Say Hello";
    }


    @GetMapping("/")
    public List<Person> getAll(){
        return service.getAll();
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<Person> getById(@PathVariable("user_id") int id){
        Person user = service.getById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404

        return new ResponseEntity<>(user, HttpStatus.OK); //200
    }

    @PostMapping("/")
    public ResponseEntity<Person> create(@RequestBody Person user){
        Person createdUser = service.create(user);
        if(createdUser == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED); //201
    }

    @GetMapping("/surname/{user_surname}")
    public List<Person> getAllBySurname(@PathVariable("user_surname") String surname){
        return service.getBySurname(surname);
    }
}
