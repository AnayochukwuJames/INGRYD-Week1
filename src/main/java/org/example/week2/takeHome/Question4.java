package org.example.week2.takeHome;

public class Question4 {
    //Write an array to store integers from 1 to 15, and sum up all the integers using forEach loop
    public static void main(String[] args) {
        int[] nums = new int[15];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            sum += nums[i];
        }
        System.out.println("Sum of numbers from 1 to 15: " + sum);
    }
}
