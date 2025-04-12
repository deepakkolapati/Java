package com.deepak.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    @Override
    public int compareTo(Student o) {
        return this.age>o.age?1:-1;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();

        studs.add(new Student("Ayush",25));
        studs.add(new Student("Deepak",23));
        studs.add(new Student("Joshi",24));

        Collections.sort(studs);
        System.out.println(studs);

        Comparator<Student> comp = (i,j) -> i.age>j.age?-1:1;
        Collections.sort(studs,comp);
        System.out.println(studs);

    }
}
