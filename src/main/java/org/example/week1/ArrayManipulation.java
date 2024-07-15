package org.example.week1;

public class ArrayManipulation {

    public static int[] generateArray() {
        return new int[]{0, 0, 3, 5, 7, 9, 18, 21, 26, 35};
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
    public static void main(String[] args) {
        int[] originalArray = generateArray();
        int[] reversedArray = reverseArray(originalArray);

        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
