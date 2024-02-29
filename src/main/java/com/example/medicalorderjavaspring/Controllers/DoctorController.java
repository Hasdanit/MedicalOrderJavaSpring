package com.example.medicalorderjavaspring.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.medicalorderjavaspring.Services.interfaces.DoctorServiceInterface
import org.springframework.http.HttpStatus;
import com.example.medicalorderjavaspring.Models.Doctor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("doctor")
public class DoctorController {
    private final DoctorServiceInterface service;
    public DoctorController(DoctorServiceInterface service) {
        this.service = service;
    }
    @GetMapping("/")
    public List<Doctor> getAll(){
        return service.getAll();
    }
    @GetMapping("/surname/{doctor_surname}")
    public List<Doctor> getBySurname(@PathVariable("doctor_surname") String doctor_surname){
        return service.getBySurname(doctor_surname);
    }
}
