//package org.example.week2;
//
//import java.util.Scanner;
//
//public class ArrayDemo1 {
//    public static void main(String[] args) {
//        //Show you how to have different type of objects e.g. {1, "Man", student}
//        //How to print the content of an array by passing the array to a printMethod
//        int[] dynamicallyLoadedIntArray;
//        String[] dynamicallyLoadedStringArray;
//        Object[] dynamicallyLoadedObjectArray;
//        dynamicallyLoadedIntArray = new ArrayDemo1().loadIntArrayDynamically();
//        dynamicallyLoadedStringArray = new ArrayDemo1().loadStringArrayDynamically();
//        dynamicallyLoadedObjectArray = new ArrayDemo1().loadObjectArrayDynamically();
//
//        new ArrayDemo1().printArrayContent(dynamicallyLoadedIntArray);
//        new ArrayDemo1().printArrayContent(dynamicallyLoadedStringArray);
//        new ArrayDemo1().printArrayContent(dynamicallyLoadedObjectArray);
//
//    }
//
//    public Object[] loadObjectArrayDynamically() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the array size for Objects");
//        int size = scanner.nextInt();
//        scanner.nextLine();
//        Object[] array = new Object[size];
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("Enter %d object of %d\n", i + 1, array.length);
//            Object obj = scanner.nextLine();
//            array[i] = obj;
//        }
//        return array;
//    }
//
//    public int[] loadIntArrayDynamically() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the array size of Integers");
//        int size = scanner.nextInt();
//        scanner.nextLine();
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("Enter %d integer of %d\n", i + 1, array.length);
//            int obj = scanner.nextInt();
//            array[i] = obj;
//        }
//        return array;
//    }
//}
