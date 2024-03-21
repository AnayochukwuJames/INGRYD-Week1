package org.example.week5.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Original array:");
        for (int num : numbersArray) {
            System.out.println(num);
        }
        System.out.println();

        System.out.println("Print out only the even numbers:");
        IntStream.of(numbersArray)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Sum up all the odd numbers in the filtered stream of odd numbers:");
        int sumOfOddNumbers = IntStream.of(numbersArray)
                .filter(num -> num % 2 != 0)
                .sum();
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
        System.out.println();

        System.out.println("Collect the even numbers in a list named even numbers:");
        List<Integer> evenNumbers = IntStream.of(numbersArray)
                .filter(num -> num % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println();

        System.out.println("Map the numbers to be a square of the number itself:");
        List<Integer> squaredNumbers = IntStream.of(numbersArray)
                .map(num -> num * num)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}