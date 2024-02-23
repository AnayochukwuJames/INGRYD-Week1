package org.example.week2;

public class IfElseIfStatementDemo {
    public static void main(String[] args) {
        int x = 55, y = 55, z = 55;

        if( x >= y ){
            System.out.println("x is greater than or equal to y");
        } else if(y >= z ){
            System.out.println("y is greater than or equal z");
        } else if( z >= y ){
            System.out.println("z is greater than y which is greater than x");
        } else {
            System.out.println("All the numbers are equal");
        }

    }
}