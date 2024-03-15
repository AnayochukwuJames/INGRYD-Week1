package org.example.week4;

import java.sql.*;

public class MySQLExercise {

    public static void main(String[] args) {

        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "david", "david");
                Statement statement = connection.createStatement();
                )
        {
            String createTableQuery = "CREATE Table IF NOT EXISTS users(id Integer, name Text, age Integer, address Text)";
            String firstCreateUserQuery = String.format("INSERT into users(id, name, age, address) values(%d, '%s', '%s', '%s') ", 1, "David Dinneya", 22, "Y Arena");
            String secondCreateUserQuery = String.format("INSERT into users(id, name, age, address) values(%d, '%s', '%s', '%s') ", 2, "Charles Dinneya", 23, "Y Arena");
            String thirdCreateUserQuery = String.format("INSERT into users(id, name, age, address) values(%d, '%s', '%s', '%s') ", 3, "Charles Dinneya", 24, "Y Arena");
            String getRecordsQuery = "SELECT * FROM users";

            //all all queries to array
            String[] queries = new String[5];
            queries[0] = createTableQuery;
            queries[1] = firstCreateUserQuery;
            queries[2] = secondCreateUserQuery;
            queries[3] = thirdCreateUserQuery;
            queries[4] = getRecordsQuery;

            for (int i = 0; i < queries.length; i++) {
                statement.execute(queries[i]);
                if (i == 4) {
                    ResultSet resultSet = statement.executeQuery(queries[i]);
                    System.out.println("Id \tName \tAge \tAddress");
                    while (resultSet.next()) {
                        //accessing each row
                        int id = resultSet.getInt(1);
                        String name = resultSet.getString(2);
                        int age = resultSet.getInt(3);
                        String address = resultSet.getString(4);
                        System.out.printf("%d \t%s \t%s \t%s\n", id, name, age, address);
                    }
                    resultSet.close();
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}