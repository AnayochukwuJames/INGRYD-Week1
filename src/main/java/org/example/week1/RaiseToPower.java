package org.example.week1;

public class RaiseToPower{
    public static int raiseToPower(int number, int power){
        if (power == 0){
            return 1;
        }
        return number * (raiseToPower(number, power-1));
    }

    public static void main(String[] args) {
        System.out.println(raiseToPower(9,3));
    }
}
