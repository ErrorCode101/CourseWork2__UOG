package com.aadhil.coursework2.uog.app.student;

import java.util.ArrayList;

public class Register {
    private static ArrayList<Student> student = new ArrayList<>();

    public Register(String id,String fName, String lName, int ict1, int ict2, int cwk1, int cwk2){
        Student newStudent = new Student(id,fName,lName,ict1,ict2,cwk1,cwk2);
        student.add(newStudent);
    }

    public static ArrayList<Student> getStudentList() {
        return student;
    }
}
