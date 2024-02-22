package org.example.week2;

import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println(count);
            count++;
        }while (count <= 40);
        Scanner scanner = new Scanner(System.in);
        do {
            String word;
            System.out.println("Please enter a word, enter 'quit' to terminate");
            word = scanner.nextLine();
            System.out.println("enter a new line" + word);
        }
        while (count <= 40);
        System.out.println(" " + count);
    }
}
