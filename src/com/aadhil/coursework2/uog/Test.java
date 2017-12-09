package com.aadhil.coursework2.uog;

import static com.aadhil.coursework2.uog.app.display.OutputDisplay.drawLine;

import  com.aadhil.coursework2.uog.app.display.InputDisplay;

/**
 * Project writer - M. M. Aadhil
 * Date - 12/06/2017
 * Test Class
 */

public class Test {
    public static void main(String[] args) {       //Program starting out put with the instructions for the program

        InputDisplay input = new InputDisplay();

        String head1 = "University of Gugsi";
        String head2 = "Software Development Group Project Module";

        System.out.printf("%80s\n %90s\n",head1,head2);
        drawLine();                                 // Drawing a line
        System.out.println();
        String comp1 = "ICT 01        - ";
        String comp2 = "ICT 02        - ";
        String comp3 = "Group CWK 01  - ";
        String comp4 = "Group CWK 02  - ";
        System.out.printf("  Subject contribution to the over all module mark:\n %30s 20%%\n %30s 20%%\n %30s 30%%\n %30s 30%%\n \n",comp1,comp2,comp3,comp4);
        System.out.println("  Instructions :");
        System.out.println("      o Choose an option");
        System.out.println("      o Enter the corresponding number of the selected option");
        System.out.println("      o Press Enter");

        input.showOptions();                              //Showing options to select for the user
    }
}
