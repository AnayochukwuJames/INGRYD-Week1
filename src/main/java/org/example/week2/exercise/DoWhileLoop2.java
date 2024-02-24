package org.example.week2.exercise;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] seriesTotals = new int[4];

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            int count = 0;

            do {
                System.out.print("Enter number " + (count + 1) + " for series " + (i + 1) + ": ");
                int number = scanner.nextInt();
                sum += number;
                count++;
            } while (count < 5);

            seriesTotals[i] = sum;
        }

        int totalSum = 0;
        System.out.println();
        for (int i = 0; i < seriesTotals.length; i++) {
            System.out.println("Series " + (i + 1) + " total: " + seriesTotals[i]);
            totalSum += seriesTotals[i];
        }
        System.out.println("\nTotal summation = " + totalSum);
    }
}
