package org.example.week2;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
//pre-generics
        List strings = new ArrayList();
        strings.add("first string");
        strings.add("second string");

        String first =(String) strings.get(0);
        System.out.println(first);


//Generics

        List<String> words = new ArrayList<>();
        words.add("first string");
        words.add("second string");

        String second = words.get(1);
        System.out.println(second);
    }


}