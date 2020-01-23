package com.example.awtSample;

import java.awt.*;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title)
    {
        super(title);
        setSize(500,500);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif",Font.BOLD,18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD,12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course",60,60);
        g.setFont(sansSerifSmall);
        g.drawString("By Jugal Sekhar Toppo",60,100);
    }

}
