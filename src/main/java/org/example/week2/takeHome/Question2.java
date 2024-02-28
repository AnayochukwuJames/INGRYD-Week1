package org.example.week2.takeHome;

import java.util.Scanner;

class Question2 {

    //Create a class and give any name create two static methods in the class called readInteger()
    // and readString() to both return an array of its type.It should return the filled array afterwards

    public static int[] readInteger() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static String[] readString() {
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }
        return array;
    }
    public static void main(String[] args) {
        // Task 2
        System.out.println("Enter 10 integers:");
        int[] integerArray = Question2.readInteger();
        System.out.println("Entered integers:");
        for (int num : integerArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Enter 10 strings:");
        String[] stringArray = Question2.readString();
        System.out.println("Entered strings:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}