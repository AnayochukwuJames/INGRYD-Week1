package org.example.week2.takeHome;

import java.util.ArrayDeque;

public class Question5 {
    public static void main(String[] args) {
        String[] strings = new String[10]; // Creating an array to store 10 strings

        // Populating the array with 10 strings
        strings[0] = "first";
        strings[1] = "second";
        strings[2] = "third";
        strings[3] = "fourth";
        strings[4] = "fifth";
        strings[5] = "sixth";
        strings[6] = "seventh";
        strings[7] = "eighth";
        strings[8] = "ninth";
        strings[9] = "tenth";

        // Using ArrayDeque to get the last element efficiently
        ArrayDeque<String> deque = new ArrayDeque<>();
        for (String str : strings) {
            deque.add(str);
        }
        String lastString = deque.getLast();

        // Printing the 1st, 5th, and last string
        System.out.println("1st string: " + strings[0]);
        System.out.println("5th string: " + strings[4]);
        System.out.println("Last string: " + lastString);
    }
}
