package com.example.medicalorderjavaspring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "person")

public class Person {
    private int id;
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String role;


    @Override
    public String toString() {
        return id + ": " + name + " " + surname + " - " + gender + ' ' + age + ' ' +role;
    }
}

