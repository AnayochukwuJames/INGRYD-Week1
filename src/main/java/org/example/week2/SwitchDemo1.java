package org.example.week2;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a digit (1 - 7) for day number: ");
        int dayOfWeek = scanner.nextInt();


        switch (dayOfWeek) {
            case 1:
                System.out.printf("Today is Monday and is represented as %d\n", dayOfWeek);
                break;
            case 2:
                System.out.printf("Today is Tuesday and is represented as %d\n", dayOfWeek);
                break;
            case 3:
                System.out.printf("Today is Wednesday and is represented as %d\n", dayOfWeek);
                break;
            case 4:
                System.out.printf("Today is Thursday and is represented as %d\n", dayOfWeek);
                break;
            case 5:
                System.out.printf("Today is Friday and is represented as %d\n", dayOfWeek);
                break;
            case 6:
                System.out.printf("Today is Saturday and is represented as %d\n", dayOfWeek);
                break;
            case 7:
                System.out.printf("Today is Sunday and is represented as %d", dayOfWeek);
                break;
            default:
                System.out.println("please enter a valid number from 1-7");

        }

    }
}