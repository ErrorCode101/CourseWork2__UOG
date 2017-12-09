package com.aadhil.coursework2.uog.app.util;

import java.util.Scanner;
import com.aadhil.coursework2.uog.app.student.*;

public class Validations {

    /**
     * @param no will be a String
     *           This method will try to parse the String no into an integer. If it fails until will repeat the user input
     *           until it can parse
     * @return will be an integer
     */
    private int intParser(String no) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean cndtn = false;
        while(!cndtn) {   //will loop until user input an integer value
            try {
                num = Integer.parseInt(no);
                cndtn = true;
            } catch(Exception e) {
                System.out.print("Input must be a number. Try again : ");
                no = in.next();
            }
        }
        return num;
    }

    /**
     * @param input is a String literal for get the user input
     * @param label is a String literal for the display label (In this program its Student last name or first name)
     *              This method will check the user input for numbers and invalid characters..
     *              if those contains it will loop until user input a valid String
     * @return will be a validated String
     */
    public String stringParser(String input,String label){
        Scanner in = new Scanner(System.in);
        if(input.matches(".*\\w.*")||(input.length()<=3)){
            while (input.matches(".*\\w.*")&&(input.length()<3)){
                System.out.println(label + " can not contain numbers or invalid characters and must contain at least 3 letters");
                System.out.print("Try again : ");
                input = in.next();
            }
        }
        return input;
    }

    /**
     * @param no will be a String mark user input
     * @param rangeLow will be the lowest mark(int)
     * @param rangeHigh will be the highest mark(int)
     * @param errorMessage will be displaying when user input a mark out of the range
     *                     this method will check whether user input mark is within the range..
     *                     if not it will loop until user enters a mark within the range
     * @return is a integer num
     */
    public int getValidatedNum(String no,int rangeLow,int rangeHigh,String errorMessage){
        Scanner in = new Scanner(System.in);
        int num = intParser(no);
        while (!(rangeLow<=num&&num<=rangeHigh)){
            System.out.print(errorMessage);
            no = in.next();
            num = intParser(no);
        }
        return num;
    }

    /**
     * @param ID is a String id user input
     *           This will check whether user have input the id before..
     * @return is boolean
     */
    public boolean checkStudentID(String ID){
        for (Student aStudent : Register.getStudentList()) {
            if (ID.equals(aStudent.getStudentId())) {
                return true;
            }
        }
        return false;
    }
}
