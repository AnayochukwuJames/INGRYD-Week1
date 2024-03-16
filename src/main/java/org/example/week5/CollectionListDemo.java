package org.example.week5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionListDemo {
    public static void main(String[] args) {

        List<Integer> addAll = new ArrayList<>();
        addAll.add(50);
        addAll.add(70);
        addAll.add(80);

        List<Integer> integerList = new LinkedList<>();
        integerList.add(90);
        Integer thirty = 30;
        integerList.set(0, thirty);
        integerList.add(1, 60);
        integerList.addAll(addAll);

        System.out.println(integerList);

        integerList.remove(thirty);
        System.out.println(integerList);

        integerList.remove(2);
        System.out.println(integerList);
        System.out.println(integerList.contains(thirty));
        System.out.println(integerList.containsAll(addAll));
        System.out.println(integerList.get(2));
        System.out.println(integerList);
        integerList.clear();
        System.out.println(integerList);
    }
}