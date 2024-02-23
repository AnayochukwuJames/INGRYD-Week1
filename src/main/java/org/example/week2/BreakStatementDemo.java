package org.example.week2;

public class BreakStatementDemo {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);

        for( int i = 1; i < Integer.MAX_VALUE; i+= 500000000 ){
            System.out.println(i);

            if( i >= 2000000000 ){
                break;
            }
        }

    }
}