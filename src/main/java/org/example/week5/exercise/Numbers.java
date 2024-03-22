package org.example.week5.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        List<Integer> integerList = Arrays.asList(numbers);

//Question1: Print out only the even numbers
        integerList.stream().filter(number -> number % 2==0).forEach(System.out::println);

//Question2: Sum up all the odd numbers in the filtered stream of odd numbers
       List<Integer> oddNumbers = integerList.stream().filter(number -> number %2 !=0).collect(Collectors.toList());

       System.out.println(oddNumbers);
        int sum = 0;
        for (Integer oddNumber : oddNumbers) {
            sum += oddNumber;
        }
        System.out.println(sum);
        System.out.println();

//Question3: Collect the even numbers in a list named evenNumbers
        List<Integer> evenNumbers =  integerList.stream().filter(number -> number %2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println();

//Question4: Map the even numbers to be a square of the number itself.
        List<Integer> squaredNumber=evenNumbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println(squaredNumber);
    }
}