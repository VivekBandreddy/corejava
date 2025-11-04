package com.capg.comparable;

import java.util.Comparator;

public record Student(int rollNumber, String name) implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        Comparator.comparing(Student::rollNumber).thenComparing(Student::name);
        return Integer.compare(this.rollNumber, o.rollNumber);
    }
}
