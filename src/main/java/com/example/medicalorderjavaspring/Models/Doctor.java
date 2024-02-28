package com.example.medicalorderjavaspring.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Doctor extends Person implements Payable {
    private int id;
    private String specialization;
    private int roomNumber;
    private boolean isAvailable;
    private double salary;

    
    @Override
    public double getPaymentAmount() {
        return salary; 
    }
}
