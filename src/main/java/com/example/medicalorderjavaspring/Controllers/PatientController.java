package com.example.medicalorderjavaspring.Controllers;

import com.example.medicalorderjavaspring.Models.Patient;
import com.example.medicalorderjavaspring.Services.interfaces.PatientServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("person")
public class PatientController {
    private final PatientServiceInterface service;
    public PatientController(PatientServiceInterface service) {
        this.service = service;
    }
    @GetMapping("/")
    public List<Patient> getAll(){
        return service.getAll();
    }
    @GetMapping("/{patient_id}")

}
