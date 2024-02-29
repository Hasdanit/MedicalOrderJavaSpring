package com.example.medicalorderjavaspring.Services;

import com.example.medicalorderjavaspring.Models.Patient;
import com.example.medicalorderjavaspring.Services.interfaces.PatientServiceInterface;
import com.example.medicalorderjavaspring.Repositories.PatientRepositoryInterface;

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

        return repo.findById(id);
    }

    public List<Patient> getByDiagnosis(String diagnosis){

        return repo.findByDiagnosis(diagnosis);
    }
    public List<Patient> getByIsOnReecord(boolean isOnReecord){
        return repo.findByisOnRecord();
    }
    public List<Patient> getByBloodType(String bloodType){
        return repo.findByBloodType(bloodType);
    }
    public List<Patient> getByIsVaccinated(boolean isVaccinated){
        return repo.findByIsVaccinated(isVaccinated);
    }
    public List<Patient> getByChronicDiseases(String chronicDiseases){
        return repo.findBy
    }
    public List<Patient> getByIsInsurance(boolean isInsurance){
        return repo.findBy
    }

    public List<Patient> getBySurname(String surname){
        return repo.findBy
    }

    public List<Patient> getByGender(String gender){
        return repo.findBy
    }

    public List<Patient> getByAge(int age){
        return repo.findBy
    }
}
