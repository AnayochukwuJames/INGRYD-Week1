package org.example.week5.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1a {
    public static void main(String[] args) {
        String[] strings = {"Mary, Maryam, Mitchel, Mimi, Margaret, Emily, Monster"};

        List<String> names = new ArrayList<>();
        names.add("Marry");
        names.add("Maryam");
        names.add("Mitchell");
        names.add("Mimi");
        names.add("Margaret");
        names.add("Emily");
        names.add("Monster");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        Predicate<String> stringPredicate = words -> words.length() <= 5;
        System.out.println("Filter words with 5 characters and below:");
        List<String> filteredWords = names.stream()
                .filter(stringPredicate)
                .collect(Collectors.toList());
        for (String word : filteredWords) {
            System.out.println(word);
        }
        System.out.println();

        Function<String, String> toUpperCaseFunction = String::toUpperCase;
        System.out.println("Convert all words to uppercase:");
        List<String> upperCaseWords = names.stream()
                .map(toUpperCaseFunction)
                .collect(Collectors.toList());
        for (String word : upperCaseWords) {
            System.out.println(word);
        }
        System.out.println();

        System.out.println("Words that start with 'Ma':");
        List<String> wordsStartWithMa = names.stream()
                .filter(word -> word.startsWith("Ma"))
                .collect(Collectors.toList());
        for (String word : wordsStartWithMa) {
            System.out.println(word);
        }
        System.out.println();

        Comparator<String> descendingComparator = Comparator.reverseOrder();
        System.out.println("Sort the list in descending order:");
        names.sort(descendingComparator);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
