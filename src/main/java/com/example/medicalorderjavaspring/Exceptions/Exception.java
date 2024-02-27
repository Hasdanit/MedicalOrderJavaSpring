package com.example.medicalorderjavaspring.Exceptions;

import java.sql.SQLException;
public class Exception {
    public static void handleSQLException(SQLException e) {
        System.out.println("Connection Type Error: " + e.getMessage());
    }
    public static void handleClassNotFoundException(ClassNotFoundException e) {
        System.out.println("Class Not Found Type Error: " + e.getMessage());
    }
    public static void handleConnectionCloseException(SQLException e) {
        System.out.println("Could Not Close The Connection: " + e.getMessage());
    }
}
