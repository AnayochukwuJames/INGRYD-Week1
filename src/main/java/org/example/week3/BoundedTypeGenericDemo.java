package org.example.week3;

import org.example.week1.GraduateStudents;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypeGenericDemo<T> {

    List<Integer> integerList;
    List<Double> doubleList;

    public BoundedTypeGenericDemo(){
        integerList = new ArrayList<>();
        doubleList = new ArrayList<>();

        for( int integer = 1; integer < 30; integer += 5){
            integerList.add(integer);
        }
        for( int i = 1; i < 35; i += 2){
            doubleList.add(i * 0.5);
        }

    }

    public static void main(String[] args) {
//        BoundedTypeGenericDemo<JavaStudent> objectOne = new BoundedTypeGenericDemo<>();
        BoundedTypeGenericDemo<GraduateStudents> objectTwo = new BoundedTypeGenericDemo<>();
        BoundedTypeGenericDemo<Integer> objectThree = new BoundedTypeGenericDemo<>();

    }

}