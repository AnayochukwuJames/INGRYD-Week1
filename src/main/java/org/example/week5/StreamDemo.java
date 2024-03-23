package org.example.week5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamDemo {

    public static int sort(Integer a, Integer b){
        return a - b;
    }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for( int i = 1; i < 31; i++ ){
            integerList.add(i);
        }
        System.out.println(integerList);

        List<Integer> modifiedList = integerList.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> (number * number))
                .sorted((first, second)-> second - first)
                .collect(Collectors.toList());

        System.out.println(modifiedList);

        List<String> strings = new ArrayList<>();
        strings.add("Mike");
        strings.add("Abdul");
        strings.add("Bashir");
        strings.add("Zainab");
        strings.add("Halima");
 
        List<String> modifiedStringList = strings.stream().filter( name -> name.length() >= 5 )
                .map( name -> name.toUpperCase()).sorted( (name1, name2) -> name2.compareTo(name1) ).collect(Collectors.toList());

        System.out.println(modifiedStringList);

        EmployeeDemo employeeDemo1 = new EmployeeDemo("ING001", "Tahir John", "Training", 500000.00);
        EmployeeDemo employeeDemo2 = new EmployeeDemo("ING002", "Sandra Bullock", "Marketing", 1500000.00);
        EmployeeDemo employeeDemo3 = new EmployeeDemo("ING003", "David John", "HR", 15000.00);
        EmployeeDemo employeeDemo4 = new EmployeeDemo("ING004", "Zainab John", "Media PR", 340000.00);
        List<EmployeeDemo> employeeDemoList = new ArrayList<>();
        employeeDemoList.add(employeeDemo1);
        employeeDemoList.add(employeeDemo2);
        employeeDemoList.add(employeeDemo3);
        employeeDemoList.add(employeeDemo4);
        // () -> System.out.println(Hello);
        employeeDemoList.stream().sorted( (a, b) -> (int) (b.getSalary() - a.getSalary())).forEach(System.out::println);

        employeeDemoList.stream().sorted( (a, b) ->  (b.getName().compareTo(a.getName()))).forEach(System.out::println);
    }
}