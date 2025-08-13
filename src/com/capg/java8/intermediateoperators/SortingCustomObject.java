package com.capg.java8.intermediateoperators;

import com.capg.java8.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCustomObject {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setId(i + "");
            employee.setName("ABC" + i);
            employee.setSalary(10000L + i);

            employeeList.add(employee);

            integerList.add(i);
        }

        System.out.println("employeeList :  " + employeeList);
        //employeeList :  [Employee{id='0', name='ABC0', salary='10000'}, Employee{id='1', name='ABC1', salary='10001'}, Employee{id='2', name='ABC2', salary='10002'}, Employee{id='3', name='ABC3', salary='10003'}, Employee{id='4', name='ABC4', salary='10004'}, Employee{id='5', name='ABC5', salary='10005'}, Employee{id='6', name='ABC6', salary='10006'}, Employee{id='7', name='ABC7', salary='10007'}, Employee{id='8', name='ABC8', salary='10008'}, Employee{id='9', name='ABC9', salary='10009'}]


        //ascending
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        integerList.add(-1);
        integerList.sort(null);
        System.out.println(integerList);
        //[-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


        //descending
        List<Employee> descensingOrder = employeeList.stream().sorted((e1, e2) -> e2.getSalary().compareTo(e1.getSalary())).collect(Collectors.toList());

        //if two objects has same salary then compare by other field using
        //employeeList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getId));

        System.out.println("employeeList Ascending order :  " + employeeList);
        //employeeList Ascending order :  [Employee{id='0', name='ABC0', salary='10000'}, Employee{id='1', name='ABC1', salary='10001'}, Employee{id='2', name='ABC2', salary='10002'}, Employee{id='3', name='ABC3', salary='10003'}, Employee{id='4', name='ABC4', salary='10004'}, Employee{id='5', name='ABC5', salary='10005'}, Employee{id='6', name='ABC6', salary='10006'}, Employee{id='7', name='ABC7', salary='10007'}, Employee{id='8', name='ABC8', salary='10008'}, Employee{id='9', name='ABC9', salary='10009'}]
        System.out.println("employeeList descending order :  " + descensingOrder);
        //employeeList descending order :  [Employee{id='9', name='ABC9', salary='10009'}, Employee{id='8', name='ABC8', salary='10008'}, Employee{id='7', name='ABC7', salary='10007'}, Employee{id='6', name='ABC6', salary='10006'}, Employee{id='5', name='ABC5', salary='10005'}, Employee{id='4', name='ABC4', salary='10004'}, Employee{id='3', name='ABC3', salary='10003'}, Employee{id='2', name='ABC2', salary='10002'}, Employee{id='1', name='ABC1', salary='10001'}, Employee{id='0', name='ABC0', salary='10000'}]

        Double averageSalary = employeeList.stream().collect(Collectors.averagingLong(Employee::getSalary));
        System.out.println("employee Average Salary :  " + averageSalary);
        //employee Average Salary :  10004.5
    }
}
