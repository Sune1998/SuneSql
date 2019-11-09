package com.company;
import java.util.Scanner;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("Wellcome to the Minecraftdb");
       Connection connection = null;
       connection = DriverManager.getConnection
               ("jdbc:mysql://localhost:3306/Minecraft?serverTimezone=UTC",
                       "user",
                       "1970");
        System.out.println("Connoction ok");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Creature would you like to know about?");
        String creatureName = scanner.nextLine();
        String newStatement = "SELECT * FROM Minecraft.Cretures WHERE Name LIKE ' " + creatureName +"';";

        Statement statement = connection.createStatement();



    }

}
