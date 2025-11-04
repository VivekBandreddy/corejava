package com.capg.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompratorSortingUsingRecords {


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            employeeList.add(new Employee(i, "ABC", BigDecimal.valueOf(100), "IT"));
        }

        System.out.println(employeeList);
        Comparator<Employee> c = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int salaryResult = o2.salary().compareTo(o1.salary());
                if (salaryResult != 0)
                    return salaryResult;
                int nameResult = o2.name().compareTo(o1.name());
                if (nameResult != 0)
                    return nameResult;
                int deptResult = o2.dept().compareTo(o1.dept());
                if (deptResult != 0)
                    return deptResult;

                return Integer.compare(o2.id(), o1.id());
            }
        };
        Collections.sort(employeeList, c);
        System.out.println(employeeList);

    }
}
