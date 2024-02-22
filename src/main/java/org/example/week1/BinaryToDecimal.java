package org.example.week1;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int convertFromBinaryToDecimal(String input){
        int length = input.length();
        int max = length - 1;
        int start = 0;
        int total = 0;
        while( start <= max ){
            String first = input.charAt(start) + "";
            int f = Integer.parseInt(first);
            total += (int)(f * Math.pow(2, (max - start)));
            start++;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a binary number; strictly 1s and 0s: ");
        String input = scanner.nextLine();
        int convertedNumber = convertFromBinaryToDecimal(input);
        System.out.println(convertedNumber);
    }
}