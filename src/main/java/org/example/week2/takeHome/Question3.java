package org.example.week2.takeHome;

public class Question3 {
    //Write an array to store the first ten numbers. Print out all the numbers using for loop
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        System.out.println("Numbers using for loop:");
        for (int number : num) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
