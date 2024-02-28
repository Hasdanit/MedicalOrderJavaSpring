package com.example.medicalorderjavaspring.Services.interfaces;

import com.example.medicalorderjavaspring.Models.Patient;

import java.util.List;

public interface PatientServiceInterface {
    List<Patient> getAll();

    Patient create(Patient patient);

    Patient getById(int id);

    Patient getByDiagnosis(String diagnosis);
    Patient getByIsOnReecord(boolean isOnReecord);
    Patient getByBloodType(String bloodType);
    Patient getByIsVaccinated(boolean isVaccinated);
    Patient getByChronicDiseases(String chronicDiseases);
    Patient getByIsInsurance(boolean isInsurance);
}
