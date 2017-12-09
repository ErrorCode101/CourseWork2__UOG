package com.aadhil.coursework2.uog.app.display;

import static com.aadhil.coursework2.uog.app.display.OutputDisplay.drawLine;
import static com.aadhil.coursework2.uog.app.processes.InputProcess.goBack;

import com.aadhil.coursework2.uog.app.processes.InputProcess;
import com.aadhil.coursework2.uog.app.util.Validations;
import com.aadhil.coursework2.uog.app.student.Register;
import java.util.Scanner;

public class InputDisplay {

    public void showOptions(){  //options menu
        InputProcess input = new InputProcess();
        drawLine();
        System.out.println("  Options : ");
        System.out.println("    1.  InputProcess Student Details ");
        System.out.println("    2.  Check Class Averages ");
        System.out.println("    3.  Check components average ");
        System.out.println("    4.  Highest Scorers ");
        System.out.println("    5.  Lowest Scorer ");
        System.out.println("    6.  Students have to re-take the module ");
        System.out.println("    7.  Students have to re-sit components");
        System.out.println("    8.  Students Module Marks with Histogram ");
        System.out.println("    9.  Histogram ");
        System.out.println("    10. Exit ");
        int opt = input.getOption();   //getting the user option
        input.openOption(opt);    //opening the results for the user option
    }

    public void stdDetails(){
        Scanner in = new Scanner(System.in);
        Validations valid =new Validations();

        System.out.print("How many student details you are going to enter : "); //input display
        String keyIn = in.next();

        int stdCnt = valid.getValidatedNum(keyIn,1,99999999,"Entered number is not acceptable. Try again : ");
        //will get an valid integer

        for(int i=1;i<=stdCnt;i++){ //will loop until the student count user wants to enter
            System.out.println();
            System.out.println("Details of Student no " + i);
            System.out.println("--------------------------");
            System.out.print("Student ID : ");
            String id = in.next();
            while(valid.checkStudentID(id)){           //loop until user enters a new student id
                System.out.println("Inserted Student ID already Exists");
                System.out.print("Student ID : ");
                id = in.next();
            }

            /*
                stringParser will get a valid user name
                getValidatedNum will get a valid component mark
             */

            System.out.print("First Name : ");
            String fName = valid.stringParser(in.next(),"First Name");

            System.out.print("Last Name : ");
            String lName = valid.stringParser(in.next(),"Last Name");

            System.out.println();
            System.out.println("Input Module Component Marks");

            System.out.print("ICT 01 : ");
            int ict1 = valid.getValidatedNum(in.next(),0,100,"Marks should between 0 -100. Try again : "); //input display

            System.out.print("ICT 02 : ");
            int ict2 = valid.getValidatedNum(in.next(),0,100,"Marks should between 0 -100. Try again : ");

            System.out.print("CWK 01 : ");
            int cwk1 = valid.getValidatedNum(in.next(),0,100,"Marks should between 0 -100. Try again : ");

            System.out.print("CWK 02 : ");
            int cwk2 = valid.getValidatedNum(in.next(),0,100,"Marks should between 0 -100. Try again : ");

            new Register(id,fName,lName,ict1,ict2,cwk1,cwk2); //adding a student
        }
        goBack();
    }
}
