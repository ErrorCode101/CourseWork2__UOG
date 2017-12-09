package com.aadhil.coursework2.uog.app.util;

import static com.aadhil.coursework2.uog.app.student.Register.getStudentList;

import com.aadhil.coursework2.uog.app.student.Student;
import com.aadhil.coursework2.uog.app.util.Comparators.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorting {
    public void sortModuleMark(boolean descending) {
        Student temp = null;
        int n = getStudentList().size();
        if(!descending) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if ((getStudentList().get(j - 1).compareTo(getStudentList().get(j)) < 0)) { //sort
                        //swap elements
                        temp = getStudentList().get(j - 1);
                        getStudentList().set((j - 1), getStudentList().get(j));
                        getStudentList().set(j, temp);
                    }
                }
            }
        }else{
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if ((getStudentList().get(j - 1).compareTo(getStudentList().get(j)) > 0)) { //sort
                        //swap elements
                        temp = getStudentList().get(j - 1);
                        getStudentList().set((j - 1), getStudentList().get(j));
                        getStudentList().set(j, temp);
                    }
                }
            }

        }
    }

    public void sortMarks(int component, boolean descending) {

        Comparator<Student> cmp = new Ict1Compare();
        switch (component){
            case 1: cmp = new Ict1Compare(); break;
            case 2: cmp = new Ict2Compare(); break;
            case 3: cmp = new Cwk1Compare(); break;
            case 4: cmp = new Cwk2Compare(); break;
        }
        if(!descending)
            ascending(cmp);
        else
            descending(cmp);
    }
    private void ascending(Comparator<Student> cmp){
        Student temp;
        int n = getStudentList().size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (cmp.compare(getStudentList().get(j-1), getStudentList().get(j)) < 0) { //sort
                    //swap elements
                    temp = getStudentList().get(j - 1);
                    getStudentList().set((j - 1), getStudentList().get(j));
                    getStudentList().set(j, temp);
                }
            }
        }
    }
    private void descending(Comparator<Student> cmp){
        Student temp;
        int n = getStudentList().size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (cmp.compare(getStudentList().get(j-1), getStudentList().get(j)) > 0) { //sort
                    //swap elements
                    temp = getStudentList().get(j - 1);
                    getStudentList().set((j - 1), getStudentList().get(j));
                    getStudentList().set(j, temp);
                }
            }
        }
    }
    public ArrayList<Student> sortLastName(ArrayList<Student> student){
        Student temp;
        int n = student.size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (student.get(j-1).getLName().compareTo(student.get(j).getLName()) > 0) { //sort
                    temp = student.get(j - 1);
                    student.set((j - 1), student.get(j));
                    student.set(j, temp);
                }
            }
        }
        return student;
    }
}
