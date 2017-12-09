package com.aadhil.coursework2.uog.app.student;

public class Student implements Comparable<Student> {

    private String studentId;
    private String fName;
    private String lName;
    private int ict1;
    private int ict2;
    private int cwk1;
    private int cwk2;
    private int moduleMark;
    private static int studentCount;

    Student(String ID, String fName, String lName, int ict1, int ict2, int cwk1, int cwk2){
        this.studentId = ID;
        this.fName = fName;
        this.lName = lName;
        this.ict1 = ict1;
        this.ict2 = ict2;
        this.cwk1 = cwk1;
        this.cwk2 = cwk2;
        this.moduleMark =(((getIct1() + getIct2()) * 2) + ((getCwk1() + getCwk2()) * 3)) / 10;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getModuleMark() {
        return moduleMark;
    }

    public int getIct1() {
        return ict1;
    }



    public int getIct2() {
        return ict2;
    }


    public int getCwk1() {
        return cwk1;
    }


    public int getCwk2() {
        return cwk2;
    }

    @Override
    public int compareTo(Student o) {
        return this.moduleMark-o.moduleMark;
    }
}
