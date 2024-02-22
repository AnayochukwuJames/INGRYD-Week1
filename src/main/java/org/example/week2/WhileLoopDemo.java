package org.example.week2;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 30){
            System.out.println(count);
            count++;
        }
        // Another example
        for (; count <= 33; count++){
            System.out.println(count);
        }
    }
}
