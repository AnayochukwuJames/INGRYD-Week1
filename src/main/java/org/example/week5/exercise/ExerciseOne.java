package org.example.week5.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciseOne {
    public static void main(String[] args) {

        String[] strings = {"Mary", "Maryam", "Mimi", "Mitchell", "Margaret", "Emily", "Monster", "Emmanuella"};

        //Question 1: Converting above array to List of Strings
        List<String> stringList = Arrays.asList(strings); //Using Arrays.asList() method

        //Using a loop
        //List<String> stringList = new ArrayList<>();
        /* for( String s: strings ){
             stringList.add(s);
         } */

        //Using the addAll() method
        //stringList.addAll(Arrays.asList(strings));

        //Question 2: Filter the List to have only items with 5 characters and below and print the List content
        Predicate<String> stringPredicate = string -> string.length() <= 5;
        //Looping method
//        for( String s: stringList ){
//            if( stringPredicate.test( s )){
//                System.out.println( s );
//            }
//        }
        //Using a stream
        stringList.stream().filter(stringPredicate).forEach(System.out::println);
        System.out.println();

        //Question 3: Write a Function<String, String> that will convert all the words to UpperCase
        Function<String, String> stringStringFunction = string -> string.toUpperCase();
        stringList.stream().map(stringStringFunction).forEach(System.out::println);
        System.out.println();

        //Question 4: Filter and collect only the words that start with 'Ma'
        //Implementing the predicate directly in the stream - unnamed predicate
        List<String> filteredMaList = stringList.stream().filter( s -> s.contains("Ma")).toList();
        filteredMaList.forEach(System.out::println);
        System.out.println();

        //Question 5: Define a Comparator<String> to sort the list in descending order
        Comparator<String> stringComparator = (string1, string2) -> string2.compareTo(string1);
        stringList.stream().sorted(stringComparator).forEach(System.out::println);

    }
}