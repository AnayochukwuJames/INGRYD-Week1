package org.example.week1;

public class Modulus {
    public static void main(String[] args) {
        // To get the modulus of 3 in 90
        for (int i = 0; i <= 90; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
