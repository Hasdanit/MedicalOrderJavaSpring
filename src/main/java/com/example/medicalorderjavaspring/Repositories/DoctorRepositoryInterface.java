package com.example.medicalorderjavaspring.Repositories;

import com.example.medicalorderjavaspring.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorRepositoryInterface {
    List<Doctor> findByPersonId(int person_id); //finds the doctors data
    List<Doctor> findByDoctorId(int doctor_id); //finds the medical data of which type of doctor he/she is
}
