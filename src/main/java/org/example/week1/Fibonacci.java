package org.example.week1;


public class Fibonacci {

    //10 Fibonacci numbers -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//    public static void printFibonacciNumber( int number ){
//        int firstNumber = 0;
//        int secondNumber = 1;
//        int totalFirstAndSecond;
//        System.out.print(firstNumber + ", ");
//        System.out.print(secondNumber + ", ");
//        for( int i = 3; i <= number; i++ ){
//            totalFirstAndSecond = firstNumber + secondNumber;
//            System.out.print(totalFirstAndSecond + ", ");
//            firstNumber = secondNumber;
//            secondNumber = totalFirstAndSecond;
//        }
//    }
//
//    public static void main(String[] args) {
//        printFibonacciNumber(15);
//    }

    public static void printFibonacciNumber(int num){
        int firstNumber = 0;
        int secondNumber = 1;
        int totalFirstAndSecond;
        System.out.println(firstNumber + " ");
        System.out.println(secondNumber + " ");
        for (int i=3; i<=num; i++){
            totalFirstAndSecond = firstNumber + secondNumber;
            System.out.println(totalFirstAndSecond);
            firstNumber = secondNumber;
            secondNumber = totalFirstAndSecond;
        }
    }

    public static void main(String[] args) {
        printFibonacciNumber(15);
    }
}