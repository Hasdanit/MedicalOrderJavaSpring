package com.example.medicalorderjavaspring;

import com.example.medicalorderjavaspring.Controllers.PersonController;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.medicalorderjavaspring.Models.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class MedicalOrderJavaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalOrderJavaSpringApplication.class, args);
    }

}
/*public class MedicalOrderJavaSpringApplication {
    private PersonController controller;
    private Scanner scanner;

    public void MyApplication(PersonController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all users");
            System.out.println("2. Get user by id");
            System.out.println("3. Create user");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-3): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllUsersMenu();
                } else if (option == 2) {
                    getUserByIdMenu();
                } else if (option == 3) {
                    createUserMenu();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer: " + e);
                scanner.nextLine(); // to ignore incorrect input
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("*************************");
        }
    }

    public void getAllUsersMenu() {
        ResponseEntity<List<Person>> response = controller.getAll();
        System.out.println(response);
    }

    public void getUserByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        PersonController personController = new PersonController();
        String response = personController.getAllByRole();
        System.out.println(response);
    }

    public void createUserMenu() {
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter gender (male/female)");
        String gender = scanner.next();
        System.out.println("Please enter age");
        int age = scanner.next();
        System.out.println("Please enter role");
        String role = scanner.next();



        String response = controller.createPerson(name, surname, gender, age, role);
        System.out.println(response);
    }*/

