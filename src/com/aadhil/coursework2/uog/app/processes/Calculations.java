package com.aadhil.coursework2.uog.app.processes;

import com.aadhil.coursework2.uog.app.student.*;

public class Calculations{
    public int classAverage() {
        int avg =0;
        for(Student s: Register.getStudentList()){
            avg += s.getModuleMark();
        }
        avg /= Register.getStudentList().size();

        return avg;
    }
    public int ict1Average() {
        int avg = 0;
        for (Student s : Register.getStudentList()) {
            avg += s.getIct1();
        }
        avg /= Register.getStudentList().size();
        return avg;
    }
    public int ict2Average() {
        int avg = 0;
        for (Student s : Register.getStudentList()) {
            avg += s.getIct2();
        }
        avg /= Register.getStudentList().size();
        return avg;
    }
    public int cwk1Average() {
        int avg = 0;
        for (Student s : Register.getStudentList()) {
            avg += s.getCwk1();
        }
        avg /= Register.getStudentList().size();
        return avg;
    }
    public int cwk2Average() {
        int avg = 0;
        for (Student s : Register.getStudentList()) {
            avg += s.getCwk2();
        }
        avg /= Register.getStudentList().size();
        return avg;
    }
}
