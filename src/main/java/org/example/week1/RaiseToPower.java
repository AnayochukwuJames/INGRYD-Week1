package org.example.week1;

public class RaiseToPower{
    // 33 3 * 3 * 3 * 1
    public static int raiseToPower(int number, int power){
        if (power == 0){
            return 1;
        }
        return number * (raiseToPower(number, power-1));
    }

    public static void main(String[] args) {
        System.out.println(raiseToPower(3,3));
    }
}
//public class RaiseToPower {
//
//    // 33 3 * 3 * 3 * 1
//    public static int raiseToPower(int number, int power){
//        if( power == 0 ){
//            return 1;
//        }
//        return number * (raiseToPower(number, power - 1));
//    }
//    //return (3 * 3 * 3 * 1)
//    public static void main(String[] args) {
//        System.out.println( raiseToPower(7, 2) );
//        System.out.println(Math.pow(7,2));
//    }
//
//}
