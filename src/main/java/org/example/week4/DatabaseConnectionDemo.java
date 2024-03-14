package org.example.week4;

import java.sql.*;

/*
Class.forName(jdbc:mysql) -> Obsolete
Connect to database : january_cohort
Create Table within the database called - users
Post several users into the table
Update user information
Delete user information
Query to select all users information
 */
public class DatabaseConnectionDemo {
    public static void main(String[] args) {

        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/january_cohort", "root", "12345");
            Statement statement = connection.createStatement();

            //Create Table users
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users(id Integer, name Text, phone_number Text, email Text)";
            statement.execute(createTableSQL);

            //Create and Post Users
//            String insertUserSQL = String.format("INSERT INTO users(id, name, phone_number, email) VALUES(%d, '%s', '%s', '%s')", 1, "My Sql", "07022558842", "mysql@mail.com" );
//            String insertUserSQL2 = "INSERT INTO users(id, name, phone_number, email) VALUES(2, 'Java Man', '0733333842', 'java@mail.com')";
//            String insertUserSQL3 = "INSERT INTO users(id, name, phone_number, email) VALUES(3, \"React Woman\", \"012554789\", \"react@mail.com\")";
//            statement.execute(insertUserSQL3);

            //Update User Information - React Woman
//            String updateUserInfo = "UPDATE users SET phone_number='08033665547' WHERE name='React Woman' ";
//            statement.execute(updateUserInfo);

            //Delete User Information - Java Man
//            String deleteUser = " DELETE from users WHERE name='Java Man' ";
//            statement.execute(deleteUser);

            //Select All Users Information
            String selectAll = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(selectAll);

            System.out.println("Id, \tName, \tPhone No., \temail");
            while( resultSet.next() ){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phone_number = resultSet.getString(3);
                String email = resultSet.getString(4);
                System.out.printf("%d \t%s \t%s \t%s\n", id, name, phone_number, email);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if( connection != null ){
                try{
                    connection.close();
                } catch (SQLException exception){
                    System.out.println(exception.getMessage());
                }
            }
        }

    }
}