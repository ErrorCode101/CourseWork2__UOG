package com.aadhil.coursework2.uog.app.display;

import com.aadhil.coursework2.uog.app.display.JFrame.Histogram2;
import com.aadhil.coursework2.uog.app.processes.Calculations;
import com.aadhil.coursework2.uog.app.util.Sorting;
import com.aadhil.coursework2.uog.app.student.Student;

import javax.swing.*;
import java.util.ArrayList;

import static com.aadhil.coursework2.uog.app.processes.InputProcess.goBack;
import static com.aadhil.coursework2.uog.app.student.Register.getStudentList;

public class OutputDisplay {

    private Calculations cal = new Calculations();

    private Sorting sort = new Sorting();

    private ArrayList<Student> passStudents,failStudents;

    public static void drawLine(){ //display lines
        String space =" ";
        System.out.printf("%2s",space);
        for(int i=0;i<150;i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public void showClassAverage(){

        if(getStudentList().size()!=0) {
            drawLine();
            System.out.print("\n   Class average for Software Development module is : "); //display results
            System.out.println(cal.classAverage());
            System.out.println();
            drawLine();
            System.out.print("\n  Students below the class average : \n");
            System.out.println();
            sort.sortModuleMark(true);
            for (Student s:getStudentList()) { //calculations
                if (s.getModuleMark() > cal.classAverage())
                    break;
                System.out.printf("%-10s %-10s %-10s %-10d\n", s.getStudentId(), s.getFName(), s.getLName(), s.getModuleMark());
            }
            drawLine();
            System.out.print("\n  Students above the class average : \n");
            System.out.println();
            sort.sortModuleMark(false);
            for (Student s : getStudentList()) {
                if (s.getModuleMark() < cal.classAverage())
                    break;
                System.out.printf("%-10s %-10s %-10s %-10d\n", s.getStudentId(), s.getFName(), s.getLName(), s.getModuleMark());
            }
            System.out.println();
        }else{
            System.out.println("No data to display");
        }
        goBack();
    }

    public void showComponentAverage(){
        if(getStudentList().size()!=0){
            drawLine();
            System.out.println(" Class averages for particular components"); //display results
            drawLine();
            System.out.print("\n   Class average for ICT 01 : " + cal.ict1Average());
            System.out.print("\n   Class average for ICT 02 : " + cal.ict2Average());
            System.out.print("\n   Class average for CWK 01 : " + cal.cwk1Average());
            System.out.print("\n   Class average for CWK 02 : " + cal.cwk2Average());
            drawLine();
            System.out.println("\n Students who got marks below 30"); // display
            drawLine();
            below30();

        }else {
            System.out.println("No data to display");
        }
        goBack();
    }

    private void below30(){
        System.out.println("For ICT 01 : ");
        boolean cndtn = false;
        for (Student s:getStudentList()) { //results display
            if (30 > s.getIct1()) {
                cndtn = true;
                System.out.printf("%-10s %-10s %-10s %-10d\n", s.getStudentId(), s.getFName(), s.getLName(), s.getIct1());
            }
        }
        if(!cndtn)
            System.out.println("   No Students has scored below 30 for the ICT 01");

        System.out.println("For ICT 02 : ");
        cndtn = false;
        for (Student s:getStudentList()) { //results display
            if (30 > s.getIct2()) {
                cndtn = true;
                System.out.printf("%-10s %-10s %-10s %-10d\n", s.getStudentId(), s.getFName(), s.getLName(), s.getIct2());
            }
        }
        if(!cndtn)
            System.out.println("   No Students has scored below 30 for the ICT 02");

        System.out.println("For CWK 01 : ");
        cndtn = false;
        for (Student s:getStudentList()) { //results display
            if (30 > s.getCwk1()) {
                cndtn = true;
                System.out.printf("%-10s %-10s %-10s %-10d\n", s.getStudentId(), s.getFName(), s.getLName(), s.getCwk1());
            }
        }
        if(!cndtn)
            System.out.println("   No Students has scored below 30 for the CWK 01");

        System.out.println("For CWK 02 : ");
        cndtn = false;
        for (Student s:getStudentList()) { //results display
            if (30 > s.getCwk2()) {
                cndtn = true;
                System.out.printf("%-10s %-10s %-10s %-10d\n", s.getStudentId(), s.getFName(), s.getLName(), s.getCwk2());
            }
        }
        if(!cndtn)
            System.out.println("   No Students has scored below 30 for the CWK 02");

    }

    public void highestScorer() {
        Student highest;

        sort.sortMarks(1,false);
        highest = getStudentList().get(0);
        System.out.println("Highest Scorer for the ICT 1 module : ");
        System.out.printf("%-10s %-10s %-10s %-10d\n", highest.getStudentId(), highest.getFName(), highest.getLName(), highest.getIct1());
        System.out.println();

        sort.sortMarks(2,false);
        highest = getStudentList().get(0);
        System.out.println("Highest Scorer for the ICT 2 module : ");
        System.out.printf("%-10s %-10s %-10s %-10d\n", highest.getStudentId(), highest.getFName(), highest.getLName(), highest.getIct2());
        System.out.println();

        sort.sortMarks(3,false);
        highest = getStudentList().get(0);
        System.out.println("Highest Scorer for the CWK 1 module : ");
        System.out.printf("%-10s %-10s %-10s %-10d\n", highest.getStudentId(), highest.getFName(), highest.getLName(), highest.getCwk1());
        System.out.println();

        sort.sortMarks(4,false);
        highest = getStudentList().get(0);
        System.out.println("Highest Scorer for the CWK 2 module : ");
        System.out.printf("%-10s %-10s %-10s %-10d\n", highest.getStudentId(), highest.getFName(), highest.getLName(), highest.getCwk1());
        System.out.println();

        goBack();
    }

    public void lowestScorer() {
        Student lowest;

        sort.sortMarks(1,true);
        lowest = getStudentList().get(0);
        System.out.println("Lowest Scorer for the ICT 1 module : ");
        System.out.printf("%-10s %-10s %-10s %-10d\n", lowest.getStudentId(), lowest.getFName(), lowest.getLName(), lowest.getIct1());
        System.out.println();

        sort.sortMarks(2,true);
        lowest = getStudentList().get(0);
        System.out.println("Lowest Scorer for the ICT 2 module : ");
        System.out.printf("%-10s %-10s %-10s %-10d\n", lowest.getStudentId(), lowest.getFName(), lowest.getLName(), lowest.getIct2());
        System.out.println();

        sort.sortMarks(3,true);
        lowest = getStudentList().get(0);
        System.out.println("Lowest Scorer for the CWK 1 module : ");
        System.out.printf("%-10s %-10s %-10s %-10d\n", lowest.getStudentId(), lowest.getFName(), lowest.getLName(), lowest.getCwk1());
        System.out.println();

        sort.sortMarks(4,true);
        lowest = getStudentList().get(0);
        System.out.println("Lowest Scorer for the CWK 2 module : ");
        System.out.printf("%-10s %-10s %-10s %-10d\n", lowest.getStudentId(), lowest.getFName(), lowest.getLName(), lowest.getCwk2());
        System.out.println();

        goBack();
    }

    public void showRetakeStudents(){
        drawLine();
        System.out.println("Students who failed the module(Must retake the module)");
        drawLine();
        retake();
        for(Student s:failStudents) {
            System.out.printf("%-10s %-10s %-10s %-10d\n", s.getStudentId(), s.getFName(), s.getLName(), s.getModuleMark());
        }
        goBack();
    }

    public void resit(){
        drawLine();
        System.out.println("Students who has to resit for particular components");
        drawLine();
        retake();
        System.out.println("Students who has to resit for ICT 1 : ");
        for(Student s:resitIct(1))
            System.out.printf("%-10s %-10s %-10s %-10d\n\n", s.getStudentId(), s.getFName(), s.getLName(), s.getIct1());
        if(resitIct(1).size()==0)
            System.out.println("   No Students has to resit for the ICT 1\n");


        System.out.println("Students who has to resit for ICT 2 : ");
        for(Student s:resitIct(2))
            System.out.printf("%-10s %-10s %-10s %-10d\n\n", s.getStudentId(), s.getFName(), s.getLName(), s.getIct2());
        if(resitIct(2).size()==0)
            System.out.println("   No Students has to resit for the ICT 2\n");

        System.out.println("Students who has to resit for CWK 1 : ");
        for(Student s:resitCwk(1))
            System.out.printf("%-10s %-10s %-10s %-10d\n\n", s.getStudentId(), s.getFName(), s.getLName(), s.getCwk1());
        if(resitCwk(1).size()==0)
            System.out.println("   No Students has to resit for the CWK 1\n");

        System.out.println("Students who has to resit for CWK 2 : ");
        for(Student s:resitCwk(2))
            System.out.printf("%-10s %-10s %-10s %-10d\n\n", s.getStudentId(), s.getFName(), s.getLName(), s.getCwk2());
        if(resitCwk(1).size()==0)
            System.out.println("   No Students has to resit for the CWK 1\n");
    }

    private ArrayList<Student> resitIct(int ict){
        ArrayList<Student> resitICT = new ArrayList<>();
        retake();
        for(Student s:passStudents){
            if(s.getModuleMark()>40){
                if((s.getIct1()+s.getIct2())/2<40) {
                    if(ict==1){
                        if(s.getIct1()<30)
                            resitICT.add(s);
                    }
                    else if(ict==2) {
                        if (s.getIct2() < 30)
                            resitICT.add(s);
                    }
                }
             }
        }
        resitICT = sort.sortLastName(resitICT);
        return resitICT;
    }

    private ArrayList<Student> resitCwk(int cwk){
        ArrayList<Student> resitCWK = new ArrayList<>();
        for(Student s:passStudents){
            if(s.getModuleMark()>40){
                if(cwk==1){
                    if(s.getCwk1()<30)
                        resitCWK.add(s);
                }else if(cwk==2) {
                    if (s.getCwk2() < 30)
                        resitCWK.add(s);
                }
            }
        }
        resitCWK = sort.sortLastName(resitCWK);
        return resitCWK;
    }

    private void retake() {
        passStudents = getStudentList();
        failStudents = new ArrayList<>();
        for (Student s : getStudentList()) {
            if (s.getModuleMark() <= 40) {
                passStudents.remove(s);
                failStudents.add(s);
            }
        }
    }

    private int studentCount(int rangeBelow,int rangeHigh){
        int count =0;
        for(Student s:getStudentList()) {
            if((s.getModuleMark()>=rangeBelow)&&(s.getModuleMark()<rangeHigh))
                count++;
        }
        return count;
    }

    public void horizontalHistogram(){
        drawLine();
        System.out.println("          Histogram");
        drawLine();
        System.out.println();
        System.out.println("Total Student Count : " + Student.getStudentCount());
        System.out.println();

        System.out.println("Student count chart for Module Marks");
        int below30 = studentCount(0,30);
        int below40 = studentCount(30,40);
        int below70 = studentCount(40,70);
        int below100 = studentCount(70,101);

        JFrame frame = new JFrame("Histogram");
        frame.add(new Histogram2(below30,below40,below70,below100));
        frame.setSize(300, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.printf("\n%6s %6s %6s %6s\n","0-29","30-39","40-69","70-100");
        int rows = findMax(below30,below40,below70,below100);
        String star1 ="*";
        String star2 ="*";
        String star3 ="*";
        String star4 ="*";

        for (int i=1;i<=rows;i++){
            if(i>below30) star1=" ";
            if(i>below40) star2=" ";
            if(i>below70) star3=" ";
            if(i>below100) star4=" ";
            System.out.printf("%6s %6s %6s %6s\n",star1,star2,star3,star4);
        }

        drawLine();
        retake();
        System.out.println("Number of Students passing the module : " + (passStudents.size()));
        drawLine();
        retake();
        System.out.println("Number of Students failing the module : " + (failStudents.size()));
        drawLine();
        System.out.println("Average Module Mark Awarded : " + cal.classAverage());
        drawLine();
        sort.sortModuleMark(false);
        Student ref = getStudentList().get(0);
        System.out.println("Highest Module Mark Achieved : " + ref.getModuleMark());
        System.out.println();
        System.out.printf("     Highest Score Achieved by : %15s %15s %15s ",ref.getStudentId(),ref.getFName(),ref.getLName());
        drawLine();
        sort.sortModuleMark(true);
        ref = getStudentList().get(0);
        System.out.println("Lowest Module Mark Achieved : " + ref.getModuleMark());
        System.out.println();
        System.out.printf("     Lowest Score Achieved by : %15s %15s %15s ",ref.getStudentId(),ref.getFName(),ref.getLName());
        drawLine();
        goBack();
    }

    private int findMax(int... vals) {
        int max = 0;
        for (int d : vals) {
            if (d > max) max = d;
        }
        return max;
    }
}
