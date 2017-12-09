package com.aadhil.coursework2.uog.app.processes;

import java.util.Scanner;

import com.aadhil.coursework2.uog.app.display.*;
import com.aadhil.coursework2.uog.app.util.Validations;

public class InputProcess {

    /**
     * Getting back to the option menu
     */
    public static void goBack(){

        Scanner in = new Scanner(System.in);
        InputDisplay disp = new InputDisplay();

        boolean pass =true;
        do{
            System.out.print("To go back type 0 and press Enter");
            if (Integer.parseInt(in.next()) == 0) {
                pass = false;
                disp.showOptions();
            }
        }while (!pass); //this will loop until user enters 0
    }
    public int getOption(){
        Scanner in = new Scanner(System.in);
        Validations valid = new Validations();

        System.out.print("Input the selected option no :");
        String opt = in.next();

        return valid.getValidatedNum(opt,1,10,"Option should be between 1 - 10. Try again : ");
        //will be getting a valid option from the user
    }
    public void openOption(int opt){ //input process

        OutputDisplay select = new OutputDisplay();
        switch(opt){
            case (1) : new InputDisplay().stdDetails();  break;
            case (2) : select.showClassAverage();break;
            case (3) : select.showComponentAverage();break;
            case (4) :
            case (5) : select.highestScorer();break;
            case (6) : select.lowestScorer();break;
            case (7) : select.showRetakeStudents();break;
            case (8) : select.resit();break;
            case (9) : select.horizontalHistogram();
            case (10): System.exit(0);
        }
    }
}
