package org.example.week1;

import java.util.Scanner;


public class FibonacciUsingRecursion {

    public static  int fibo(int n){
        if (n<=1)
            return n;
        return fibo(n-1) + fibo(n-2);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your limit point for the fibonacci series");
        int input = scanner.nextInt();
        for (int n = 0; n <= input; n++){
            System.out.print(fibo(n) + ",");
        }
    }
}