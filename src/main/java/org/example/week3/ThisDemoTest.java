package org.example.week3;

public class ThisDemoTest {

    public static void main(String[] args) {
        ThisDemo mariam = new ThisDemo("Mariam", "Jelica", 25, "US", 50000.00);
        ThisDemo david = new ThisDemo("David", "H", 25);
        ThisDemo mike = new ThisDemo("Mike", "Pence", 25, "US");


        System.out.println(mariam);
        System.out.println(david);
        System.out.println(mike);
    }
}