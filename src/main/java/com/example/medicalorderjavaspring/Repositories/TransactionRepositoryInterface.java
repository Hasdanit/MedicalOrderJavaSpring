package com.example.medicalorderjavaspring.Repositories;

import com.example.medicalorderjavaspring.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TransactionRepositoryInterface {
    List<Transaction> findByDoctorId(int doctor_id); //finds the how many should patient pay to the doctor

}
