package org.example.week4;

import java.io.*;
import java.util.Scanner;

public class ReadAndWriteContactList {
    //Create the file
    static File file = new File("/Users/decagon/IdeaProjects/INGRYD/src/main/java/org/example/week4/FileReadAndWrite.text");
    /*
    Write a Program that
    1. List Contacts
    2. Add New Contact
    3. Quit the program with 'Q'
     */
    public static void listContacts(){
        System.out.println("You have requested to List the Contacts");
        System.out.println("Loading....");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException exception){
            System.out.println(exception.getMessage());
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = null;
            System.out.println("Full name\t\t\t\tPhone No.\t\tEmail Address");
            while( (line = reader.readLine()) != null ){
                String[] parts = line.split(",");
                try{
                    Thread.sleep(900);
                } catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                System.out.println(parts[0] + "\t\t" + parts[1] + "\t\t" + parts[2] );
            }
        } catch(IOException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static void addContacts(){
        System.out.println("You have requested to add a new contact");
        System.out.println("Loading....");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String number = scanner.nextLine();
        System.out.println("Enter email address: ");
        String email = scanner.nextLine();
        String contact = name + "," + number + "," + email;
        try{
            System.out.println("Your contact as below:");
            System.out.printf("Name: %s, Phone No.: %s, Email: %s\n", name, number, email);
            System.out.println("Adding your new contact");
            Thread.sleep(1500);
            System.out.println("Contact successfully added");
        } catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            writer.write(contact + "\n");
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}