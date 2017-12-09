package com.aadhil.coursework2.uog.app.util.Comparators;

import com.aadhil.coursework2.uog.app.student.Student;

import java.util.Comparator;

public class Ict2Compare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getIct2(), o2.getIct2());
    }
}
