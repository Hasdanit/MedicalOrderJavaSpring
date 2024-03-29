package com.example.medicalorderjavaspring;

import com.example.medicalorderjavaspring.Models.Person;
import com.example.medicalorderjavaspring.Exceptions.Exception;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String connectionString = "jdbc:postgresql://localhost:5432/medicalsystem";
        ArrayList<Person> users = new ArrayList<>();
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionString, "postgres", "0000");

            String sql = "SELECT id, name, surname, gender, age, role FROM person ORDER BY id;";
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                String role = rs.getString("role");

                Person person = new Person(id, name, surname, gender, age, role);
                users.add(person);
            }
        } catch (SQLException e) {
            Exception.handleSQLException(e);
        } catch (ClassNotFoundException e) {
            Exception.handleClassNotFoundException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    Exception.handleConnectionCloseException(e);
                }
            }
        }

        for (Person person : users) {
            System.out.println(person);
        }
    }
}