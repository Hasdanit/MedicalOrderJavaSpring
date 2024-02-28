package com.example.medicalorderjavaspring.Services.interfaces;

import com.example.medicalorderjavaspring.Models.Transaction;

import java.util.Date;
import java.util.List;

public interface TransactionServiceInterface {
    Transaction create(Transaction transaction);
    Transaction getById(int id);
    List<Transaction> getAll();
    Transaction getByDiscription(String description);
    Transaction getByAmount(double amount);
    List<Transaction> getByDate(Date date);


}
