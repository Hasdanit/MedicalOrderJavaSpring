package com.example.medicalorderjavaspring.Controllers;

import com.example.medicalorderjavaspring.Models.Patient;
import com.example.medicalorderjavaspring.Services.interfaces.PatientServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {
    private final PatientServiceInterface service;
    public PatientController(PatientServiceInterface service) {
        this.service = service;
    }
    @GetMapping("/")
    public List<Patient> getAll(){
        return service.getAll();
    }
    @GetMapping("/{patient_id}")
    public ResponseEntity<Patient> getById(@PathVariable("patient_id") int id){
        Patient user = service.getById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //gives us an error 404

        return new ResponseEntity<>(user, HttpStatus.OK); //error 200
    }
    @PostMapping("/")
    public ResponseEntity<Patient> create(@RequestBody Patient user){
        Patient createdUser = service.create(user);
        if(createdUser == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED); //201
    }
    @GetMapping("/surname/{patient_surname}")
    public List<Patient> getAllBySurname(@PathVariable("patient_surname") String surname){
        return service.getBySurname(surname);
    }
    @GetMapping("/gender/{patient_gender}")
    public List<Patient> getAllByGender(@PathVariable("patient_gender") String gender){
        return service.getBySurname(gender);
    }
    @GetMapping("/age/{patient_age}")
    public List<Patient> getAllByAge(@PathVariable("patient_age") int age){
        return service.getByAge(age);
    }
    @GetMapping("/role/{patient_role}")
    public List<Patient> getAllByRole(@PathVariable("patient_role") String role){
        return service.getBySurname(role);
    }
    @GetMapping("/is_vaccinated/{patient_is_vaccinated}")
    public List<Patient> getAllByIsVaccinated(@PathVariable("patient_is_vaccinated") boolean isVaccinated){
        return service.getByIsVaccinated(isVaccinated);
    }
    @GetMapping("/is_on_reecord/{patient_is_on_reecord}")
    public List<Patient> getAllByIsOnReecord(@PathVariable("patient_is_on_reecord") boolean isOnReecord){
        return service.getByIsOnReecord(isOnReecord);
    }
    @GetMapping("/blood_type/{patient_blood_type}")
    public List<Patient> getAllByBloodType(@PathVariable("patient_blood_type") String bloodType){
        return service.getByBloodType(bloodType);
    }
    @GetMapping("/chronic_diseases/{patient_chronic_diseases}")
    public List<Patient> getAllByChronicDiseases(@PathVariable("patient_chronic_diseases") String chronicDiseases){
        return service.getByChronicDiseases(chronicDiseases);
    }
    @GetMapping("/is_insurance/{patient_is_insurance}")
    public List<Patient> getAllByIsInsurance(@PathVariable("patient_is_insurance") boolean isInsurance){
        return service.getByIsInsurance(isInsurance);
    }
    @GetMapping("/diagnosis/{patient_diagnosis}")
    public List<Patient> getAllByDiagnosis(@PathVariable("patient_diagnosis") String diagnosis){
        return service.getByDiagnosis(diagnosis);
    }


}
