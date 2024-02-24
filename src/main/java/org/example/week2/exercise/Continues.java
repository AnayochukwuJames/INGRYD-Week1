package org.example.week2.exercise;

public class Continues {
    public static void main(String[] args) {
        for (int i = 0; i<=25; i++){
            if (i %4 ==0){
                continue;
            }
            System.out.println(i);
        }

    }
//    public static void main(String[] args) {
//        for (int i = 1; i <= 25; i++) {
//            if (i % 4 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
}
