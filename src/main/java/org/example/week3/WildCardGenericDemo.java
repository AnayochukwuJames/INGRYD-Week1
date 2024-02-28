package org.example.week3;

import java.util.ArrayList;
import java.util.List;

public class WildCardGenericDemo {

    public static void listPrinter(List<?> objectList ){
        for( Object object: objectList ){
            System.out.println(object);
        }
    }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for( int i = 0; i < 10; i++ ){
            integerList.add(i);
        }

        List<String> stringList = new ArrayList<>();
        for( int i = 0; i < 10; i++ ){
            stringList.add("String" + (i + 1));
        }

        listPrinter(stringList);
        listPrinter(integerList);

    }


}