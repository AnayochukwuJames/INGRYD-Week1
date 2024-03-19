package org.example.week5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> intPredicate = integer -> integer % 2 == 0;
        List<Integer> integerList = new ArrayList<>();

        for( int i = 1; i < 20; i++ ){
            integerList.add(i);

            if( intPredicate.test(i)){
                System.out.println(i + " is an even number");
            }
        }
        System.out.println();

        integerList.stream().filter(intPredicate).forEach(System.out::println);
    }
}