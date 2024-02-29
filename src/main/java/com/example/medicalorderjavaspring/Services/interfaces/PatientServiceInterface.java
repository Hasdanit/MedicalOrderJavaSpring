package com.example.medicalorderjavaspring.Services.interfaces;

import com.example.medicalorderjavaspring.Models.Patient;

import java.util.List;

public interface PatientServiceInterface {
    List<Patient> getAll();

    Patient create(Patient patient);

    Patient getById(int id);

    List<Patient> getByDiagnosis(String diagnosis);

    List<Patient> getByIsOnReecord(boolean isOnReecord);

    List<Patient> getByBloodType(String bloodType);

    List<Patient> getByIsVaccinated(boolean isVaccinated);

    List<Patient> getByChronicDiseases(String chronicDiseases);

    List<Patient> getByIsInsurance(boolean isInsurance);

}