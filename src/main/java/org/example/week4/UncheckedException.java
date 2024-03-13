package org.example.week4;

public class UncheckedException {

    public static int divide(int a, int b){
        int result = 0;
        try{
            result = a/b;
        } catch(ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }
}