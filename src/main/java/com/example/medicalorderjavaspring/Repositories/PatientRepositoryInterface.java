package com.example.medicalorderjavaspring.Repositories;

import com.example.medicalorderjavaspring.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepositoryInterface {
    List<Patient> findByPersonId(int person_id); //finds the patients data based on the id
    List<Patient> findByPatientId(int patient_id); //finds the medical data of patient

    List<Patient> findAll();

    Patient save(Patient patient);

    Patient findById(int id);

    List<Patient> findByDiagnosis(String diagnosis);

    List<Patient> findByisOnRecord(boolean isOnRecord);

    List<Patient> findByIsVaccinated(boolean isVac);

    List<Patient> findByBloodType(String bloodType);
    List<Patient> findByChronicDiseases(String ChronicDiseases);
    List<Patient> findByIsInsurance(boolean isInsurance);







}
