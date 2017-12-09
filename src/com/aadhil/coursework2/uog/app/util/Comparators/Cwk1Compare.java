package com.aadhil.coursework2.uog.app.util.Comparators;

import com.aadhil.coursework2.uog.app.student.Student;

import java.util.Comparator;

public class Cwk1Compare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCwk1(), o2.getCwk1());
    }
}