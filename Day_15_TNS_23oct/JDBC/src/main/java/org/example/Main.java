package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/?user=root/JDBC",
                    "root",
                    "password"
            );

            System.out.println("Connected successfully!");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}