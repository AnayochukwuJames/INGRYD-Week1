package org.example.week5;

import java.util.*;

public class CollectionSetDemo {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Isaac");
        stringList.add("Isaac");
        stringList.add("Isaac");
        stringList.add("Isaac");
        System.out.println(stringList);
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Rufai Sanni");
        stringSet.add("John Doe");

        System.out.println(stringSet.add("Rufai Sanni"));
        System.out.println(stringSet);

        System.out.println(stringSet.add("Rufai Sani"));
        System.out.println(stringSet);

        System.out.println(stringSet.add("rufai sanni"));
        System.out.println(stringSet);

        stringSet.addAll(stringList);
        System.out.println(stringSet);

        System.out.println(stringSet.contains("John Dow"));

        stringSet.remove("John Doe");
        System.out.println(stringSet);

        Iterator<String> iterator = stringSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===========================================");
        stringSet.forEach(s -> System.out.println(s));
        System.out.println("===========================================");

        for(String s: stringSet ){
            System.out.println(s);
        }
        System.out.println("===========================================");

        for( int i = 0; i < stringSet.size(); i++ ){
            System.out.println();
        }

    }
}