package com.practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clock_label;
    private Font font = new Font("Dialog", Font.BOLD, 30);

    MyWindow() {
        super.setTitle("My Clock");
        super.setSize(400, 400);
        super.setLocation(300, 100);
        this.createGUI(); // called
        this.startClock();
        super.setVisible(true);
    }

    public void createGUI() {
        //creating heading object
        heading = new JLabel("My Clock");
        clock_label = new JLabel("clock");
        heading.setFont(font);
        clock_label.setFont(font); // using already created class

        this.setLayout(new GridLayout(2, 1)); // to divide it into rows and col

        this.add(heading);
        this.add(clock_label);
    }

    public void startClock() {
//        Timer timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                String dateTime = new Date().toString();
////                    String dateTime = new Date().toLocaleString();
//
//                Date d = new Date();
//                SimpleDateFormat sfd = new SimpleDateFormat("hh: mm: ss");
//                String dateTime = sfd.format(d);
//                clock_label.setText(dateTime);
//            }
//        }) {
//        };
//        timer.start();

 // By Using threading ...
        Thread t = new Thread() {
            public void run() {
                try {
                    while (true) {

                        Date d = new Date();
                        SimpleDateFormat sfd = new SimpleDateFormat("hh: mm: ss");
                        String dateTime = sfd.format(d);
                        clock_label.setText(dateTime);
                        Thread.currentThread().sleep(1000);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }

}