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
    public Doctor getByRoomNumber(int roomNumber) {
        return null;
    }

    @Override
    public List<Doctor> getBySpecialization(String specialization) {
        return null;
    }

    @Override
    public Doctor getByIsAvailable(boolean isAvailable) {
        return null;
    }

    @Override
    public Doctor getBySalary(double salary) {
        return null;
    }

    @Override
    public List<Doctor> getBySurname(String doctorSurname) {
        return null;
    }
}
