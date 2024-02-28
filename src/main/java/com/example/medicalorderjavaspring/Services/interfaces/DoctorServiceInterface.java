package com.example.medicalorderjavaspring.Services.interfaces;

import com.example.medicalorderjavaspring.Models.Doctor;

import java.util.List;

public interface DoctorServiceInterface {
    List<Doctor> getAll();

    Doctor create(Doctor doctor);

    Doctor getById(int id);

    Doctor getByRoomNumber(int roomNumber);

    List<Doctor> getBySpecialization(String specialization);

    Doctor getByIsAvailable(boolean isAvailable);

    Doctor getBySalary(double salary);



}
