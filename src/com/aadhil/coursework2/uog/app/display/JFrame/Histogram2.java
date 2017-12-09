package com.aadhil.coursework2.uog.app.display.JFrame;

import javax.swing.*;
import java.awt.*;

public class Histogram2 extends JPanel {
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;

    public Histogram2(int mark1, int mark2, int mark3, int mark4){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.drawString("0 - 29", 50, 20 );
        g.drawString("30 - 39", 100, 20 );
        g.drawString("40 - 69", 150, 20 );
        g.drawString("70 - 100", 200, 20 );
        g2d.setColor(Color.blue);
        int gap = 70;
        for(int i=1;i<=mark1;i++){
            if(i>1)gap=10;
            g2d.fillOval(50, i*gap, 10, 10);
        }
        gap = 70;
        for(int i=1;i<=mark2;i++){
            if(i>1)gap=10;
            g2d.fillOval(100, i*gap, 10, 10);
        }
        gap = 70;
        for(int i=1;i<=mark3;i++){
            if(i>1)gap=10;
            g2d.fillOval(150, i*gap, 10, 10);
        }
        gap = 70;
        for(int i=1;i<=mark4;i++){
            if(i>1)gap=10;
            g2d.fillOval(200, i*gap, 10, 10);
        }
    }
}
