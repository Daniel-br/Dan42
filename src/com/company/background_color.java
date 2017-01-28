package com.company;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class background_color {
    private  JFrame frame = new JFrame();
    private JPanel panel = new JPanel(), nav = new JPanel();
    private JLabel aLabel ;
    private JButton btn;
    public background_color() {
        // Panel Attributes
        panel.setSize(500,500);
        panel.setVisible(true);
        panel.setBackground(new Color(80,219, 156));
        frame.getContentPane().add(panel);


        // nav Attributes
        nav.setSize(500,40);
        nav.setVisible(true);
        nav.setBackground(new Color(219, 90, 80));
        frame.getContentPane().add(nav);
        panel.add(nav);
        // Frame Attributes
        frame.setTitle("truuuuuuuuuuuu");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args){
        background_color app = new background_color();
    }
}
