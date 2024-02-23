package org.example.week2;

public class IfStatementDemo {
    public static void main(String[] args) {

        int x = 20;
        int y = 21;

        if( x < y ){
            System.out.printf("%d is less than %d", x, y);
        }

        if( x != y ){
            System.out.printf("%d is not equal to %d", x, y);
        }

        if( x > y )
            System.out.println(x + " is greater than " + y);


    }
}