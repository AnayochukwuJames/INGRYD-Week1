package org.example.week2;

public class EnhancedForLoopDemo {
    public static void main(String[] args) {

        int[] arrayOfIntegerNumbers = {1, 4, 5, 6, 9, 3, 24, 4, 6, 10, 22, 34, 25, 10};
        int count = 1;
        System.out.println(arrayOfIntegerNumbers.length);
        for( int i = 0; i < arrayOfIntegerNumbers.length; i++ ){
            System.out.println(arrayOfIntegerNumbers[i]);
            System.out.println("Print count " + count++);
        }
//        for( int integer: arrayOfIntegerNumbers ){
//            System.out.println(integer);
//        }

    }
}