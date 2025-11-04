package com.capg.collections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class SetExample {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("John", 25));
        set.add(new Person("Jane", 30));
        set.add(new Person("John", 25));
        System.out.println(set.size()); //2
        System.out.println(set);
        Person p = new Person("tom", 20);

        String name = "abc";
        AtomicReference<String> str = new AtomicReference<>(name);
        set.stream().filter(s -> s.getName().equals("John")).forEach(s -> {
            str.set(s.getName());
            p.setName("Jerry");
            p.setAge(21);
        });

        System.out.println(str.get());

        System.out.println(set);

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
