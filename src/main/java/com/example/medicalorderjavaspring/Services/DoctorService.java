package com.example.medicalorderjavaspring.Services;

import com.example.medicalorderjavaspring.Models.Doctor;
import com.example.medicalorderjavaspring.Services.interfaces.DoctorServiceInterface;
import com.example.medicalorderjavaspring.Repositories.DoctorRepositoryInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public class DoctorService implements DoctorServiceInterface {
    private final DoctorRepositoryInterface repo;

    public DoctorService(DoctorRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Doctor> getAll() {
        return repo.findAll();
    }

    @Override
    public Doctor create(Doctor doctor) {
        return repo.save(doctor);
    }

    @Override
    public Doctor getById(int id) {
        return repo.findById(id).orElse(null);
    }
}
