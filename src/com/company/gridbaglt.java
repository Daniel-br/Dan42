package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class gridbaglt {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private GridBagLayout grid = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();
    private JButton btn, btn1;
    public gridbaglt() {
        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        // Panel!
        panel.setSize(500, 500);
        panel.setLocation(0,0);
        panel.setBackground(new Color(221,221,221));
        frame.getContentPane().add(panel);
        panel.setLayout(grid);
        c.fill = GridBagConstraints.HORIZONTAL;
        // Button 'btn'
        c.gridx = 0;
        c.gridy = 0;

        btn = new JButton("Press me!");
        btn.setVisible(true);
        panel.add(btn, c);
        // Button 'btn'
        c.gridx = 1;
        c.gridy = 1;
        btn1 = new JButton("Press me!");
        btn1.setVisible(true);
        panel.add(btn1, c);

        // Mouse Listener test
        panel.addMouseMotionListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse Dragged AT X: "+e.getX()+" Y: "+e.getY());
            }

        });
        panel.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed AT X: "+e.getX()+" Y: "+e.getY());
            }
        });

    }

    public static void main(String[] args){
        gridbaglt app = new gridbaglt();
    }
}
