package org.example.week1;


public class Fibonacci {

    //10 Fibonacci numbers -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void fibonacciNumber(int number){
        int firstNumber= 0;
        int secondNumber = 1;
        int totalFirstAndSecond;
        for (int i = 3; i<=number; i++){
            totalFirstAndSecond = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = totalFirstAndSecond;
            System.out.println(totalFirstAndSecond);
        }

    }

    public static void main(String[] args) {
        int number = 10;
        fibonacciNumber(number);
    }

}

