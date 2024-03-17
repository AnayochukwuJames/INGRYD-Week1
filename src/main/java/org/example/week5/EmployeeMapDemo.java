package org.example.week5;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapDemo {

    public static void updateSalary(String key, double salary, Map<String, EmployeeDemo> employees){
        //WRITE YOUR CODE HERE
        EmployeeDemo employeeDemo = employees.get(key);
        employeeDemo.setSalary(salary);
        employees.put(key, employeeDemo);


    }





    public static void main(String[] args) {
        EmployeeDemo employeeDemo1 = new EmployeeDemo("ING001", "David John", "Training", 150000.00);
        EmployeeDemo employeeDemo2 = new EmployeeDemo("ING002", "Sandra Bullock", "Marketing", 150000.00);
        EmployeeDemo employeeDemo3 = new EmployeeDemo("ING003", "David John", "Training", 150000.00);
        EmployeeDemo employeeDemo4 = new EmployeeDemo("ING004", "David John", "Training", 150000.00);

        Map<String, EmployeeDemo> employeeDemoMap = new HashMap<>();
        employeeDemoMap.put(employeeDemo1.getId(), employeeDemo1);
        employeeDemoMap.put(employeeDemo2.getId(), employeeDemo2);
        employeeDemoMap.put(employeeDemo3.getId(), employeeDemo3);
        employeeDemoMap.put(employeeDemo4.getId(), employeeDemo4);

        System.out.println(employeeDemoMap);
        System.out.println("========================================");
        updateSalary("ING001", 600000, employeeDemoMap);
        System.out.println("========================================");

        for( Map.Entry<String, EmployeeDemo> entry : employeeDemoMap.entrySet() ){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        System.out.println("========================================");

        for( String key : employeeDemoMap.keySet() ){
            System.out.println(key + " --> " + employeeDemoMap.get(key));
        }

        System.out.println(employeeDemoMap.get("ING003"));
    }
}