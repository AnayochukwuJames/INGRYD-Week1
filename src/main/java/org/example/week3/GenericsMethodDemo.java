package org.example.week3;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodDemo {

    public static void printArray(Integer[] array){
        for( Integer integer : array ){
            System.out.println(integer);
        }
    }

    public static void printArray(Double[] array){
        for( Double doubles : array ){
            System.out.println(doubles);
        }
    }

    public static void printArray(Character[] array){
        for( Character character : array ){
            System.out.println(character);
        }
    }

    public static void printArray(String[] array){
        for( String string : array ){
            System.out.println(string);
        }
    }

    public static <T> void printArray(T[] array){
        for (T t : array ){
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{3, 5, 30, 45, 50};
        Double[] doubleArray = {4.5, 5.0, 25.6, 3.9, 4.7};
        Character[] characters = {'A', 'B', 'Y', 'O', 'm'};
        String[] stringArray = new String[]{"Joy", "Man", "Woman", "Stop"};
        printArray(intArray);
        printArray(doubleArray);
        printArray(characters);
        printArray(stringArray);

        List<Integer> list = new ArrayList<>();

    }

}

