package org.example.week2;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String string = "  Hello,     World!   ";
        System.out.println(string);
        System.out.println(string.trim());
        System.out.println(string.trim().toUpperCase().concat("Lower Letters here"));
        System.out.println(string.toLowerCase());
        System.out.println(string.replace('H', 'Y'));
        System.out.println(string.replace("Hell", "Haven"));
        System.out.println(string.replace("He", "Yell"));
        System.out.println(string.replace('o', 'e'));
        System.out.println();
        System.out.println();

        string = "Hello, what, is, your, name";
        String[] split = string.split(",");
        System.out.println(Arrays.asList(split));
        for( String s: split ){
            System.out.println(s);
        }

        string = "AnotherStringFromHere";
        String[] splitting = string.split("");

        for( String s: splitting ){
            System.out.println(s);
        }
    }
}