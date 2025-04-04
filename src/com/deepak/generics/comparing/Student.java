package com.deepak.generics.comparing;

import java.util.Arrays;

public class Student implements Comparable<Student> {
        private int rollno;
        public float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.marks-o.marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, 20.3f);
        Student s2 = new Student(2, 18.8f);

        Student[] s = {s1,s2};
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));




    }
}
