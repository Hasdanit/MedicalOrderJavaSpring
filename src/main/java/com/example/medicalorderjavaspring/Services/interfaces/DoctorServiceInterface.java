package com.example.medicalorderjavaspring.Services.interfaces;

import com.example.medicalorderjavaspring.Models.Doctor;

import java.util.List;

public interface DoctorServiceInterface {

    Doctor getByRoomNumber(int roomNumber);

    List<Doctor> getBySpecialization(String specialization);

    Doctor getByIsAvailable(boolean isAvailable);

    Doctor getBySalary(double salary);


    List<Doctor> getBySurname(String doctorSurname);
}
