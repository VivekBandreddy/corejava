package com.capg.exam.practice;

import com.capg.java8.Employee;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Tom");
        employee.setSalary(10000L);
        employee.setId("1");

        Employee employee1 = employee;
        employee.setName("jerry");
        System.out.println(employee);
        System.out.println(employee1);

        Integer i = Integer.valueOf(10);
        Integer j = i;

        i = 20;

        System.out.println(i);
        System.out.println(j);

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().minusDays(31));
    }
}
