package com.capg.exam.practice;

import com.capg.java8.Employee;

public class CallByValueCheck {

    public int checkCallByValue(Employee employee , int i){
        employee.setName("Jerry");
        i = i*i;
        return i;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("Tom");
        employee.setSalary(100000L);

        int i = 10;
        CallByValueCheck callByValueCheck = new CallByValueCheck();
        int j = callByValueCheck.checkCallByValue(employee , i);

        System.out.println(employee);
        System.out.println(i);
        System.out.println(j);
    }
}
