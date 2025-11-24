package com.capg.immutable;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {
        List<Department> departmentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            departmentList.add(new Department("" + i, "" + i));
        }
        Employee employee = new Employee("Tom", "123", departmentList);
        System.out.println(employee.getDepartmentList().size());
        employee.getDepartmentList().add(new Department(null, null));
        System.out.println(employee.getDepartmentList().size());
    }
}
