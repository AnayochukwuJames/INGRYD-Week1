package org.example.week5.exercise;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class WeekFiveExerciseTwo {

    public static void main(String[] args) {

        int[] integers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        //Q1
        stream(integers).filter(integer -> (integer % 2 == 0)).forEach(System.out::println);

        System.out.println();

        //Q2
        List<Integer> integerList = Arrays.stream(integers).boxed().toList();
        Integer sumOfOdd = stream(integers).filter(integer -> integer % 2 != 0).sum();
        System.out.println(sumOfOdd);

        System.out.println();

        //Q3
        List<Integer> evenIntegersList = integerList.stream().filter(integer -> integer % 2 == 0).toList();
        System.out.println(evenIntegersList);

        //Q4
        System.out.println();
        List<Integer> squareEvenNumbers = integerList.stream().filter(integer -> integer % 2 == 0)
                .map(x -> (((int) Math.pow(x, 2))))
                .toList();
        System.out.println(squareEvenNumbers);

    }
}