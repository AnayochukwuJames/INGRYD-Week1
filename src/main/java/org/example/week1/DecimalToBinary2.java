package org.example.week1;

import java.util.Scanner;

public class DecimalToBinary2 {
    //4 -> 100, 7 -> 111
    public String covertDecimalToBinary(int number){
        StringBuilder binaryString = new StringBuilder();

        while( number > 0 ){
            int remainder = number % 2;
            binaryString.append(remainder);
            number /= 2;
        }
        return binaryString.reverse().toString();
    }


    public static void main(String[] args) {
        DecimalToBinary2 decimalToBinary = new DecimalToBinary2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer number: ");
        int number = scanner.nextInt();
        String binary = decimalToBinary.covertDecimalToBinary(number);
        System.out.println("This is the binary output of " + number + " : " + binary);
    }

}