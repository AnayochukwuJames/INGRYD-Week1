package org.example.week4;

import java.util.Scanner;

public class ReadAndWriteContactListTest {
    public static void main(String[] args) {
        String input = null;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println();

            System.out.println("Contact List Application");

            System.out.println("Enter 1 / 2 / 3");
            System.out.println("1. Print Out All Contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. To terminate the program.");
            input = scanner.nextLine();
            switch (Integer.parseInt(input)){
                case 1:
                    ReadAndWriteContactList.listContacts();
                    System.out.println("All Contacts printed on console");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    ReadAndWriteContactList.addContacts();
                    break;
                case 3:
                    System.out.println("You have terminated the program");
                    System.exit(0);
                default:
                    System.out.println("Invalid input please enter a correct number from 1 - 31");
            }

        } while( !(input.equals(String.valueOf(3)) ));

    }
}