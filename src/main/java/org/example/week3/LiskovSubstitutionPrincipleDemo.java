package org.example.week3;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrincipleDemo {

    public void liskovDemo(Number number){
        System.out.println(number);
    }

    public void printList(List<Integer> intList){
        for( Integer x: intList ){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        LiskovSubstitutionPrincipleDemo demo = new LiskovSubstitutionPrincipleDemo();
        Integer integer = 35;
        Double doubleNumber = 35.6;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for( int x = 1; x < 50; x++ ){
            arrayList.add(x);
        }
        demo.liskovDemo(integer);
        demo.liskovDemo(doubleNumber);
        demo.printList(arrayList);
    }

}