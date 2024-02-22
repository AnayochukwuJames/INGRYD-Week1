package org.example.week1;

import java.util.Scanner;

public class ForLoopFactorial {

    //5! -> 1 * 2 * 3 * 4 * 5 = 120
    public static int myFactorialCalculator( int number ){
        int total = 1;
        if( number == 1 ){
            System.out.println(number);
            return 1;
        } else {
            for( int i = number; i >= 1; i-- ){
                System.out.print(i+ " * ");
                total *= i;
            }
        }
        return total;
    }
    // 5 * 4 * 3 * 2 * 1 = 120
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the factorial number: ");
        int number = scanner.nextInt();
        int factorialNumber = myFactorialCalculator(number);
        System.out.println("The factorial of " + number + " is: " + factorialNumber);
    }
}