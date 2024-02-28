package com.example.medicalorderjavaspring.Repositories;

import com.example.medicalorderjavaspring.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepositoryInterface {
    List<Patient> findByPersonId(int person_id); //finds the patients data based on the id
    List<Patient> findByPatientId(int patient_id); //finds the medical data of patient
}
