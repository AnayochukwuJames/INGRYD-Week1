//package org.example.week2;
//public class ArrayDemo {
//    public static <Student> void main(String[] args) {
//
//        int[] staticInitializedIntArray = {2,3,4,5,6,7,8,9,10};
//        int[] dynamicallyInitializedArray = new int[7];
//        String[] stringsArray = {"Man", "Woman", "Boy", "Girl"};
//        String[] dynamicStringsArray = new String[5];
//        Student[] studentsArray = new Student[3];
//
////        dynamicallyInitializedArray[1] = 30;
//
//        for( int i = 0; i < dynamicallyInitializedArray.length; i++ ){
//            dynamicallyInitializedArray[i] = i * 2;
//        }
//        for( int i = 0; i < dynamicStringsArray.length; i++ ){
//            dynamicStringsArray[i] = i * 2 + "String";
//        }
//        for( int i = 0; i < studentsArray.length; i++ ){
//            studentsArray[i] = new Student("Student 0"+(i+1),25 + i*2, "Female", "Java");
//        }
//
//        for( int x : staticInitializedIntArray ){
//            System.out.print( x + ", ");
//        }
//        System.out.println();
//
//        for( int i = 0; i < dynamicallyInitializedArray.length; i++ ){
//            System.out.print( dynamicallyInitializedArray[i] );
//            if( i +1 == dynamicallyInitializedArray.length)
//                break;
//            System.out.print(", ");
//        }
//        System.out.println();
//
//        for( String x : stringsArray ){
//            System.out.print( x + ", ");
//        }
//        System.out.println();
//
//        for( String x : dynamicStringsArray ){
//            System.out.print( x + ", ");
//        }
//        System.out.println();
//
//        for( Student x : studentsArray ){
//            System.out.println( x );
//        }
//        System.out.println();
//    }
//}
