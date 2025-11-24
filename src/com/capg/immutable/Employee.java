package com.capg.immutable;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private final String name;
    private final String id;
    private final List<Department> departmentList;

    public Employee(String name, String id, List<Department> departmentList) {
        this.name = name;
        this.id = id;
        this.departmentList = departmentList;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Department> getDepartmentList() {
        //defensive copy mechanism so that object will not be modified
        return new ArrayList<>(departmentList);
    }


}
