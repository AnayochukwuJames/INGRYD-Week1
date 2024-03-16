package org.example.week5;

import java.util.HashMap;
import java.util.Map;

public class CollectionMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> numbering = new HashMap<>();
        numbering.put(1, "ONE");
        numbering.put(2, "TWO");
        numbering.put(3, "THREE");
        numbering.put(4, "FOUR");
        numbering.put(5, "FIVE");
        numbering.put(6, "SIX");
        numbering.put(7, "SEVEN");

        System.out.println(numbering.get(6));

        for( Integer x : numbering.keySet() ){
            System.out.println(x + " --> " + numbering.get(x));
        }


    }
}