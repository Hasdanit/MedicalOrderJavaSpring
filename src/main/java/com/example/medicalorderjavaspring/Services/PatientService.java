package com.example.medicalorderjavaspring.Services;

import com.example.medicalorderjavaspring.Models.Patient;
import com.example.medicalorderjavaspring.Services.interfaces.PatientServiceInterface;
import com.example.medicalorderjavaspring.Repositories.PatientRepositoryInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public class PatientService implements PatientServiceInterface{
    private final PatientRepositoryInterface repo;

    public PatientService(PatientRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Patient> getAll() {
        return repo.findAll();
    }

    @Override
    public Patient create(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public Patient getById(int id) {
        return repo.findById(id).orElse(null);
    }

}
