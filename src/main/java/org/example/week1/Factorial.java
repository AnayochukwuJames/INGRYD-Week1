package org.example.week1;

import java.util.Scanner;

public class Factorial {
    //5! -> 5 * 4 * 3 * 2 * 1 = 120
    public int myFactorialCalculator( int number ){
        if( number == 1 )
            return 1;
        System.out.printf("%d * myFactorialCalculator((%d -1))\n", number, number);
        return number * myFactorialCalculator(number -1);
    }
    // 5 * 4 * 3 * 2 * 1 = 120
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the factorial number: ");
        int number = scanner.nextInt();
        int factorialNumber = factorial.myFactorialCalculator(number);
        System.out.println("The factorial of " + number + " is: " + factorialNumber);
    }
}